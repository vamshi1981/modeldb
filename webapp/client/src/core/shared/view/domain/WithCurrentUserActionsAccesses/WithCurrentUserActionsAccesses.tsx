import * as R from 'ramda';
import * as React from 'react';
import { connect } from 'react-redux';

import * as EntitiesActions from 'models/EntitiesActions';
import { IApplicationState } from 'store/store';

import * as Common from 'core/shared/models/Common';
import { exhaustiveCheck } from 'core/shared/utils/exhaustiveCheck';
import * as DatasetsStore from 'store/datasets';
import * as DatasetVersionsStore from 'store/datasetVersions';
import * as ExperimentRunsStore from 'store/experimentRuns';
import * as ExperimentsStore from 'store/experiments';
import * as ProjectsStore from 'store/projects';

export interface ILocalProps<T extends EntitiesActions.UserEntityAction[]> {
  entityType: Exclude<Common.EntityType, 'endpoint'>;
  entityId: string;
  actions: T;
  children: (opts: {
    isLoading: boolean;
    actionsAccesses: IActionAccesses<T[number]>;
  }) => React.ReactNode;
}

export type IActionAccesses<
  SpecificUserEntityAction extends EntitiesActions.UserEntityAction
> = Record<SpecificUserEntityAction, boolean>;

const mapStateToProps = (
  state: IApplicationState,
  localProps: ILocalProps<EntitiesActions.UserEntityAction[]>
) => {
};

type AllProps<T extends EntitiesActions.UserEntityAction[]> = ILocalProps<T> &
  ReturnType<typeof mapStateToProps>;

class WithCurrentUserActionsAccesses<
  T extends EntitiesActions.UserEntityAction[]
> extends React.PureComponent<AllProps<T>> {
  public render() {
    const {
      actions,
    } = this.props;

    const actionsAccesses = R.fromPairs(
      actions.map(action => [
        action,
        true,
      ])
    ) as IActionAccesses<EntitiesActions.UserEntityAction>;

    return this.props.children({
      actionsAccesses,
      isLoading: false,
    });
  }
}

export default connect(mapStateToProps)(WithCurrentUserActionsAccesses);