# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetEntitiesResult',
    'AwaitableGetEntitiesResult',
    'get_entities',
    'get_entities_output',
]

@pulumi.output_type
class GetEntitiesResult:
    """
    A collection of values returned by getEntities.
    """
    def __init__(__self__, entities=None, id=None, type=None):
        if entities and not isinstance(entities, dict):
            raise TypeError("Expected argument 'entities' to be a dict")
        pulumi.set(__self__, "entities", entities)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def entities(self) -> 'outputs.GetEntitiesEntitiesResult':
        return pulumi.get(self, "entities")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetEntitiesResult(GetEntitiesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEntitiesResult(
            entities=self.entities,
            id=self.id,
            type=self.type)


def get_entities(entities: Optional[pulumi.InputType['GetEntitiesEntitiesArgs']] = None,
                 type: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEntitiesResult:
    """
    The entities data source allows all entities to be retrieved by its type.

    - `type` (String) Type of the entity, e.g. SERVICE. All available entity types can be retrieved with [/api/v2/entityTypes](https://www.dynatrace.com/support/help/dynatrace-api/environment-api/entity-v2/get-all-entity-types).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_dynatrace as dynatrace

    test = dynatrace.get_entities(type="SERVICE")
    pulumi.export("serviceList", test.entities)
    ```
    """
    __args__ = dict()
    __args__['entities'] = entities
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dynatrace:index/getEntities:getEntities', __args__, opts=opts, typ=GetEntitiesResult).value

    return AwaitableGetEntitiesResult(
        entities=__ret__.entities,
        id=__ret__.id,
        type=__ret__.type)


@_utilities.lift_output_func(get_entities)
def get_entities_output(entities: Optional[pulumi.Input[Optional[pulumi.InputType['GetEntitiesEntitiesArgs']]]] = None,
                        type: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEntitiesResult]:
    """
    The entities data source allows all entities to be retrieved by its type.

    - `type` (String) Type of the entity, e.g. SERVICE. All available entity types can be retrieved with [/api/v2/entityTypes](https://www.dynatrace.com/support/help/dynatrace-api/environment-api/entity-v2/get-all-entity-types).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_dynatrace as dynatrace

    test = dynatrace.get_entities(type="SERVICE")
    pulumi.export("serviceList", test.entities)
    ```
    """
    ...
