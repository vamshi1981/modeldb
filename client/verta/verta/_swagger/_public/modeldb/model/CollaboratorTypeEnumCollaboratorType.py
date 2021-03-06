# THIS FILE IS AUTO-GENERATED. DO NOT EDIT
from verta._swagger.base_type import BaseType

class CollaboratorTypeEnumCollaboratorType(BaseType):
  _valid_values = [
    "READ_ONLY",
    "READ_WRITE",
  ]

  def __init__(self, val):
    if val not in CollaboratorTypeEnumCollaboratorType._valid_values:
      raise ValueError('{} is not a valid value for CollaboratorTypeEnumCollaboratorType'.format(val))
    self.value = val

  def to_json(self):
    return self.value

  def from_json(v):
    if isinstance(v, str):
      return CollaboratorTypeEnumCollaboratorType(v)
    else:
      return CollaboratorTypeEnumCollaboratorType(CollaboratorTypeEnumCollaboratorType._valid_values[v])

