# -*- coding: utf-8 -*-

class Dataset(object):
    """Repo with single location for the dataset."""
    def __init__(self, repo):
        self._repo = repo
        self._path = self._repo.name

    def create_version(self, blob):
        # TODO: be able to specify new version's parent, maybe using commit ID?
        commit = self._repo.get_commit(branch="master")
        commit.update(self._path, blob)
        commit.save("Update dataset {}".format(self._path))

        return DatasetVersion(commit, self._path)

class DatasetVersion(object):
    """Commit."""
    def __init__(self, commit, path):
        self._commit = commit
        self._path = path
