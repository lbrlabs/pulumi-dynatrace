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

__all__ = ['K8sClusterAnomaliesArgs', 'K8sClusterAnomalies']

@pulumi.input_type
class K8sClusterAnomaliesArgs:
    def __init__(__self__, *,
                 cpu_requests_saturation: pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs'],
                 memory_requests_saturation: pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs'],
                 monitoring_issues: pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs'],
                 pods_saturation: pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs'],
                 readiness_issues: pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs'],
                 scope: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a K8sClusterAnomalies resource.
        :param pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs'] cpu_requests_saturation: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs'] memory_requests_saturation: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs'] monitoring_issues: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs'] pods_saturation: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs'] readiness_issues: Alerts if cluster has not been ready for a given amount of time
        :param pulumi.Input[str] scope: The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        pulumi.set(__self__, "cpu_requests_saturation", cpu_requests_saturation)
        pulumi.set(__self__, "memory_requests_saturation", memory_requests_saturation)
        pulumi.set(__self__, "monitoring_issues", monitoring_issues)
        pulumi.set(__self__, "pods_saturation", pods_saturation)
        pulumi.set(__self__, "readiness_issues", readiness_issues)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter(name="cpuRequestsSaturation")
    def cpu_requests_saturation(self) -> pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs']:
        """
        no documentation available
        """
        return pulumi.get(self, "cpu_requests_saturation")

    @cpu_requests_saturation.setter
    def cpu_requests_saturation(self, value: pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs']):
        pulumi.set(self, "cpu_requests_saturation", value)

    @property
    @pulumi.getter(name="memoryRequestsSaturation")
    def memory_requests_saturation(self) -> pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs']:
        """
        no documentation available
        """
        return pulumi.get(self, "memory_requests_saturation")

    @memory_requests_saturation.setter
    def memory_requests_saturation(self, value: pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs']):
        pulumi.set(self, "memory_requests_saturation", value)

    @property
    @pulumi.getter(name="monitoringIssues")
    def monitoring_issues(self) -> pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs']:
        """
        no documentation available
        """
        return pulumi.get(self, "monitoring_issues")

    @monitoring_issues.setter
    def monitoring_issues(self, value: pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs']):
        pulumi.set(self, "monitoring_issues", value)

    @property
    @pulumi.getter(name="podsSaturation")
    def pods_saturation(self) -> pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs']:
        """
        no documentation available
        """
        return pulumi.get(self, "pods_saturation")

    @pods_saturation.setter
    def pods_saturation(self, value: pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs']):
        pulumi.set(self, "pods_saturation", value)

    @property
    @pulumi.getter(name="readinessIssues")
    def readiness_issues(self) -> pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs']:
        """
        Alerts if cluster has not been ready for a given amount of time
        """
        return pulumi.get(self, "readiness_issues")

    @readiness_issues.setter
    def readiness_issues(self, value: pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs']):
        pulumi.set(self, "readiness_issues", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)


@pulumi.input_type
class _K8sClusterAnomaliesState:
    def __init__(__self__, *,
                 cpu_requests_saturation: Optional[pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs']] = None,
                 memory_requests_saturation: Optional[pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs']] = None,
                 monitoring_issues: Optional[pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs']] = None,
                 pods_saturation: Optional[pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs']] = None,
                 readiness_issues: Optional[pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs']] = None,
                 scope: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering K8sClusterAnomalies resources.
        :param pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs'] cpu_requests_saturation: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs'] memory_requests_saturation: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs'] monitoring_issues: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs'] pods_saturation: no documentation available
        :param pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs'] readiness_issues: Alerts if cluster has not been ready for a given amount of time
        :param pulumi.Input[str] scope: The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        if cpu_requests_saturation is not None:
            pulumi.set(__self__, "cpu_requests_saturation", cpu_requests_saturation)
        if memory_requests_saturation is not None:
            pulumi.set(__self__, "memory_requests_saturation", memory_requests_saturation)
        if monitoring_issues is not None:
            pulumi.set(__self__, "monitoring_issues", monitoring_issues)
        if pods_saturation is not None:
            pulumi.set(__self__, "pods_saturation", pods_saturation)
        if readiness_issues is not None:
            pulumi.set(__self__, "readiness_issues", readiness_issues)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter(name="cpuRequestsSaturation")
    def cpu_requests_saturation(self) -> Optional[pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs']]:
        """
        no documentation available
        """
        return pulumi.get(self, "cpu_requests_saturation")

    @cpu_requests_saturation.setter
    def cpu_requests_saturation(self, value: Optional[pulumi.Input['K8sClusterAnomaliesCpuRequestsSaturationArgs']]):
        pulumi.set(self, "cpu_requests_saturation", value)

    @property
    @pulumi.getter(name="memoryRequestsSaturation")
    def memory_requests_saturation(self) -> Optional[pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs']]:
        """
        no documentation available
        """
        return pulumi.get(self, "memory_requests_saturation")

    @memory_requests_saturation.setter
    def memory_requests_saturation(self, value: Optional[pulumi.Input['K8sClusterAnomaliesMemoryRequestsSaturationArgs']]):
        pulumi.set(self, "memory_requests_saturation", value)

    @property
    @pulumi.getter(name="monitoringIssues")
    def monitoring_issues(self) -> Optional[pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs']]:
        """
        no documentation available
        """
        return pulumi.get(self, "monitoring_issues")

    @monitoring_issues.setter
    def monitoring_issues(self, value: Optional[pulumi.Input['K8sClusterAnomaliesMonitoringIssuesArgs']]):
        pulumi.set(self, "monitoring_issues", value)

    @property
    @pulumi.getter(name="podsSaturation")
    def pods_saturation(self) -> Optional[pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs']]:
        """
        no documentation available
        """
        return pulumi.get(self, "pods_saturation")

    @pods_saturation.setter
    def pods_saturation(self, value: Optional[pulumi.Input['K8sClusterAnomaliesPodsSaturationArgs']]):
        pulumi.set(self, "pods_saturation", value)

    @property
    @pulumi.getter(name="readinessIssues")
    def readiness_issues(self) -> Optional[pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs']]:
        """
        Alerts if cluster has not been ready for a given amount of time
        """
        return pulumi.get(self, "readiness_issues")

    @readiness_issues.setter
    def readiness_issues(self, value: Optional[pulumi.Input['K8sClusterAnomaliesReadinessIssuesArgs']]):
        pulumi.set(self, "readiness_issues", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)


class K8sClusterAnomalies(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cpu_requests_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesCpuRequestsSaturationArgs']]] = None,
                 memory_requests_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMemoryRequestsSaturationArgs']]] = None,
                 monitoring_issues: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMonitoringIssuesArgs']]] = None,
                 pods_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesPodsSaturationArgs']]] = None,
                 readiness_issues: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesReadinessIssuesArgs']]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a K8sClusterAnomalies resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesCpuRequestsSaturationArgs']] cpu_requests_saturation: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMemoryRequestsSaturationArgs']] memory_requests_saturation: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMonitoringIssuesArgs']] monitoring_issues: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesPodsSaturationArgs']] pods_saturation: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesReadinessIssuesArgs']] readiness_issues: Alerts if cluster has not been ready for a given amount of time
        :param pulumi.Input[str] scope: The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: K8sClusterAnomaliesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a K8sClusterAnomalies resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param K8sClusterAnomaliesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(K8sClusterAnomaliesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cpu_requests_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesCpuRequestsSaturationArgs']]] = None,
                 memory_requests_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMemoryRequestsSaturationArgs']]] = None,
                 monitoring_issues: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMonitoringIssuesArgs']]] = None,
                 pods_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesPodsSaturationArgs']]] = None,
                 readiness_issues: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesReadinessIssuesArgs']]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = K8sClusterAnomaliesArgs.__new__(K8sClusterAnomaliesArgs)

            if cpu_requests_saturation is None and not opts.urn:
                raise TypeError("Missing required property 'cpu_requests_saturation'")
            __props__.__dict__["cpu_requests_saturation"] = cpu_requests_saturation
            if memory_requests_saturation is None and not opts.urn:
                raise TypeError("Missing required property 'memory_requests_saturation'")
            __props__.__dict__["memory_requests_saturation"] = memory_requests_saturation
            if monitoring_issues is None and not opts.urn:
                raise TypeError("Missing required property 'monitoring_issues'")
            __props__.__dict__["monitoring_issues"] = monitoring_issues
            if pods_saturation is None and not opts.urn:
                raise TypeError("Missing required property 'pods_saturation'")
            __props__.__dict__["pods_saturation"] = pods_saturation
            if readiness_issues is None and not opts.urn:
                raise TypeError("Missing required property 'readiness_issues'")
            __props__.__dict__["readiness_issues"] = readiness_issues
            __props__.__dict__["scope"] = scope
        super(K8sClusterAnomalies, __self__).__init__(
            'dynatrace:index/k8sClusterAnomalies:K8sClusterAnomalies',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cpu_requests_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesCpuRequestsSaturationArgs']]] = None,
            memory_requests_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMemoryRequestsSaturationArgs']]] = None,
            monitoring_issues: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMonitoringIssuesArgs']]] = None,
            pods_saturation: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesPodsSaturationArgs']]] = None,
            readiness_issues: Optional[pulumi.Input[pulumi.InputType['K8sClusterAnomaliesReadinessIssuesArgs']]] = None,
            scope: Optional[pulumi.Input[str]] = None) -> 'K8sClusterAnomalies':
        """
        Get an existing K8sClusterAnomalies resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesCpuRequestsSaturationArgs']] cpu_requests_saturation: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMemoryRequestsSaturationArgs']] memory_requests_saturation: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesMonitoringIssuesArgs']] monitoring_issues: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesPodsSaturationArgs']] pods_saturation: no documentation available
        :param pulumi.Input[pulumi.InputType['K8sClusterAnomaliesReadinessIssuesArgs']] readiness_issues: Alerts if cluster has not been ready for a given amount of time
        :param pulumi.Input[str] scope: The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _K8sClusterAnomaliesState.__new__(_K8sClusterAnomaliesState)

        __props__.__dict__["cpu_requests_saturation"] = cpu_requests_saturation
        __props__.__dict__["memory_requests_saturation"] = memory_requests_saturation
        __props__.__dict__["monitoring_issues"] = monitoring_issues
        __props__.__dict__["pods_saturation"] = pods_saturation
        __props__.__dict__["readiness_issues"] = readiness_issues
        __props__.__dict__["scope"] = scope
        return K8sClusterAnomalies(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cpuRequestsSaturation")
    def cpu_requests_saturation(self) -> pulumi.Output['outputs.K8sClusterAnomaliesCpuRequestsSaturation']:
        """
        no documentation available
        """
        return pulumi.get(self, "cpu_requests_saturation")

    @property
    @pulumi.getter(name="memoryRequestsSaturation")
    def memory_requests_saturation(self) -> pulumi.Output['outputs.K8sClusterAnomaliesMemoryRequestsSaturation']:
        """
        no documentation available
        """
        return pulumi.get(self, "memory_requests_saturation")

    @property
    @pulumi.getter(name="monitoringIssues")
    def monitoring_issues(self) -> pulumi.Output['outputs.K8sClusterAnomaliesMonitoringIssues']:
        """
        no documentation available
        """
        return pulumi.get(self, "monitoring_issues")

    @property
    @pulumi.getter(name="podsSaturation")
    def pods_saturation(self) -> pulumi.Output['outputs.K8sClusterAnomaliesPodsSaturation']:
        """
        no documentation available
        """
        return pulumi.get(self, "pods_saturation")

    @property
    @pulumi.getter(name="readinessIssues")
    def readiness_issues(self) -> pulumi.Output['outputs.K8sClusterAnomaliesReadinessIssues']:
        """
        Alerts if cluster has not been ready for a given amount of time
        """
        return pulumi.get(self, "readiness_issues")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional[str]]:
        """
        The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")
