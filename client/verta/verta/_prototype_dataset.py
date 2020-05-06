# -*- coding: utf-8 -*-

class Dataset(object):
    """Repo with single location for the dataset."""
    def __init__(self, repo):
        self._repo = repo
        self._path = self._repo.name

    def create_version(self, blob):
        # TODO: be able to specify new version's parent, maybe using commit ID?
        # TODO: maybe support naming versions, as commit tags?
        commit = self._repo.get_commit(branch="master")
        commit.update(self._path, blob)
        commit.save("Update dataset {}".format(self._path))

        return DatasetVersion(commit, self._path)

    def get_version(self, id):
        # TODO: should we be using commit IDs as version IDs?
        commit = self._repo.get_commit(id=id)

        return DatasetVersion(commit, self._path)

    def get_latest_version(self):
        # TODO: if there are branching lineages, this isn't necessarily correct
        commit = self._repo.get_commit(branch="master")

        return DatasetVersion(commit, self._path)

    def list_versions(self):
        # TODO: if there are branching lineages, this definitely isn't correct
        head = self._repo.get_commit(branch="master")

        return [commit.id for commit in head.log()]

class DatasetVersion(object):
    """Commit."""
    def __init__(self, commit, path):
        self._commit = commit
        self._path = path

    def __repr__(self):
        return repr(self._commit.get(self._path))

    def list_parents(self):
        return [commit.id for commit in self._commit.log()][1:]
