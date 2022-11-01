# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['JiraNotificationArgs', 'JiraNotification']

@pulumi.input_type
class JiraNotificationArgs:
    def __init__(__self__, *,
                 active: pulumi.Input[bool],
                 description: pulumi.Input[str],
                 issue_type: pulumi.Input[str],
                 profile: pulumi.Input[str],
                 project_key: pulumi.Input[str],
                 summary: pulumi.Input[str],
                 url: pulumi.Input[str],
                 username: pulumi.Input[str],
                 api_token: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a JiraNotification resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] description: The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        :param pulumi.Input[str] issue_type: The type of the Jira issue to be created by this notification
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] project_key: The project key of the Jira issue to be created by this notification
        :param pulumi.Input[str] summary: The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] url: The URL of the Jira API endpoint
        :param pulumi.Input[str] username: The username of the Jira profile
        :param pulumi.Input[str] api_token: The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        :param pulumi.Input[str] name: The name of the notification configuration
        """
        pulumi.set(__self__, "active", active)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "issue_type", issue_type)
        pulumi.set(__self__, "profile", profile)
        pulumi.set(__self__, "project_key", project_key)
        pulumi.set(__self__, "summary", summary)
        pulumi.set(__self__, "url", url)
        pulumi.set(__self__, "username", username)
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Input[bool]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: pulumi.Input[bool]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="issueType")
    def issue_type(self) -> pulumi.Input[str]:
        """
        The type of the Jira issue to be created by this notification
        """
        return pulumi.get(self, "issue_type")

    @issue_type.setter
    def issue_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "issue_type", value)

    @property
    @pulumi.getter
    def profile(self) -> pulumi.Input[str]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

    @profile.setter
    def profile(self, value: pulumi.Input[str]):
        pulumi.set(self, "profile", value)

    @property
    @pulumi.getter(name="projectKey")
    def project_key(self) -> pulumi.Input[str]:
        """
        The project key of the Jira issue to be created by this notification
        """
        return pulumi.get(self, "project_key")

    @project_key.setter
    def project_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_key", value)

    @property
    @pulumi.getter
    def summary(self) -> pulumi.Input[str]:
        """
        The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: pulumi.Input[str]):
        pulumi.set(self, "summary", value)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The URL of the Jira API endpoint
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        The username of the Jira profile
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        """
        The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _JiraNotificationState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 issue_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 project_key: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering JiraNotification resources.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] api_token: The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        :param pulumi.Input[str] description: The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        :param pulumi.Input[str] issue_type: The type of the Jira issue to be created by this notification
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] project_key: The project key of the Jira issue to be created by this notification
        :param pulumi.Input[str] summary: The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] url: The URL of the Jira API endpoint
        :param pulumi.Input[str] username: The username of the Jira profile
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if issue_type is not None:
            pulumi.set(__self__, "issue_type", issue_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if profile is not None:
            pulumi.set(__self__, "profile", profile)
        if project_key is not None:
            pulumi.set(__self__, "project_key", project_key)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        """
        The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="issueType")
    def issue_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Jira issue to be created by this notification
        """
        return pulumi.get(self, "issue_type")

    @issue_type.setter
    def issue_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issue_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def profile(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

    @profile.setter
    def profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile", value)

    @property
    @pulumi.getter(name="projectKey")
    def project_key(self) -> Optional[pulumi.Input[str]]:
        """
        The project key of the Jira issue to be created by this notification
        """
        return pulumi.get(self, "project_key")

    @project_key.setter
    def project_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_key", value)

    @property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[str]]:
        """
        The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "summary", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the Jira API endpoint
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username of the Jira profile
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class JiraNotification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 issue_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 project_key: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a JiraNotification resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] api_token: The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        :param pulumi.Input[str] description: The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        :param pulumi.Input[str] issue_type: The type of the Jira issue to be created by this notification
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] project_key: The project key of the Jira issue to be created by this notification
        :param pulumi.Input[str] summary: The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] url: The URL of the Jira API endpoint
        :param pulumi.Input[str] username: The username of the Jira profile
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JiraNotificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a JiraNotification resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param JiraNotificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JiraNotificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 issue_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 project_key: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JiraNotificationArgs.__new__(JiraNotificationArgs)

            if active is None and not opts.urn:
                raise TypeError("Missing required property 'active'")
            __props__.__dict__["active"] = active
            __props__.__dict__["api_token"] = None if api_token is None else pulumi.Output.secret(api_token)
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if issue_type is None and not opts.urn:
                raise TypeError("Missing required property 'issue_type'")
            __props__.__dict__["issue_type"] = issue_type
            __props__.__dict__["name"] = name
            if profile is None and not opts.urn:
                raise TypeError("Missing required property 'profile'")
            __props__.__dict__["profile"] = profile
            if project_key is None and not opts.urn:
                raise TypeError("Missing required property 'project_key'")
            __props__.__dict__["project_key"] = project_key
            if summary is None and not opts.urn:
                raise TypeError("Missing required property 'summary'")
            __props__.__dict__["summary"] = summary
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiToken"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(JiraNotification, __self__).__init__(
            'dynatrace:index/jiraNotification:JiraNotification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            api_token: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            issue_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            profile: Optional[pulumi.Input[str]] = None,
            project_key: Optional[pulumi.Input[str]] = None,
            summary: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'JiraNotification':
        """
        Get an existing JiraNotification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] api_token: The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        :param pulumi.Input[str] description: The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        :param pulumi.Input[str] issue_type: The type of the Jira issue to be created by this notification
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] project_key: The project key of the Jira issue to be created by this notification
        :param pulumi.Input[str] summary: The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] url: The URL of the Jira API endpoint
        :param pulumi.Input[str] username: The username of the Jira profile
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _JiraNotificationState.__new__(_JiraNotificationState)

        __props__.__dict__["active"] = active
        __props__.__dict__["api_token"] = api_token
        __props__.__dict__["description"] = description
        __props__.__dict__["issue_type"] = issue_type
        __props__.__dict__["name"] = name
        __props__.__dict__["profile"] = profile
        __props__.__dict__["project_key"] = project_key
        __props__.__dict__["summary"] = summary
        __props__.__dict__["url"] = url
        __props__.__dict__["username"] = username
        return JiraNotification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> pulumi.Output[Optional[str]]:
        """
        The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
        """
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="issueType")
    def issue_type(self) -> pulumi.Output[str]:
        """
        The type of the Jira issue to be created by this notification
        """
        return pulumi.get(self, "issue_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def profile(self) -> pulumi.Output[str]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

    @property
    @pulumi.getter(name="projectKey")
    def project_key(self) -> pulumi.Output[str]:
        """
        The project key of the Jira issue to be created by this notification
        """
        return pulumi.get(self, "project_key")

    @property
    @pulumi.getter
    def summary(self) -> pulumi.Output[str]:
        """
        The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        """
        return pulumi.get(self, "summary")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL of the Jira API endpoint
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The username of the Jira profile
        """
        return pulumi.get(self, "username")

