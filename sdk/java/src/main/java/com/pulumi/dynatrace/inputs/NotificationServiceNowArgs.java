// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationServiceNowArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationServiceNowArgs Empty = new NotificationServiceNowArgs();

    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    /**
     * @return The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }

    /**
     * The ID of the associated alerting profile
     * 
     */
    @Import(name="alertingProfile", required=true)
    private Output<String> alertingProfile;

    /**
     * @return The ID of the associated alerting profile
     * 
     */
    public Output<String> alertingProfile() {
        return this.alertingProfile;
    }

    /**
     * The ServiceNow instance identifier. It refers to the first part of your own ServiceNow URL.   This field is mutually exclusive with the **url** field. You can only use one of them
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The ServiceNow instance identifier. It refers to the first part of your own ServiceNow URL.   This field is mutually exclusive with the **url** field. You can only use one of them
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The content of the ServiceNow description.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    @Import(name="message", required=true)
    private Output<String> message;

    /**
     * @return The content of the ServiceNow description.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    public Output<String> message() {
        return this.message;
    }

    /**
     * The name of the notification configuration
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the notification configuration
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The username to the ServiceNow account
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The username to the ServiceNow account
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Send events into ServiceNow ITOM (`true`)
     * 
     */
    @Import(name="sendEvents", required=true)
    private Output<Boolean> sendEvents;

    /**
     * @return Send events into ServiceNow ITOM (`true`)
     * 
     */
    public Output<Boolean> sendEvents() {
        return this.sendEvents;
    }

    /**
     * Send incidents into ServiceNow ITSM (`true`)
     * 
     */
    @Import(name="sendIncidents", required=true)
    private Output<Boolean> sendIncidents;

    /**
     * @return Send incidents into ServiceNow ITSM (`true`)
     * 
     */
    public Output<Boolean> sendIncidents() {
        return this.sendIncidents;
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    /**
     * The URL of the on-premise ServiceNow installation.   This field is mutually exclusive with the **instanceName** field. You can only use one of them
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the on-premise ServiceNow installation.   This field is mutually exclusive with the **instanceName** field. You can only use one of them
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The username of the ServiceNow account.   Make sure that your user account has the `rest_service`, `web_request_admin`, and `x_dynat_ruxit.Integration` roles
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username of the ServiceNow account.   Make sure that your user account has the `rest_service`, `web_request_admin`, and `x_dynat_ruxit.Integration` roles
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private NotificationServiceNowArgs() {}

    private NotificationServiceNowArgs(NotificationServiceNowArgs $) {
        this.active = $.active;
        this.alertingProfile = $.alertingProfile;
        this.instanceName = $.instanceName;
        this.message = $.message;
        this.name = $.name;
        this.password = $.password;
        this.sendEvents = $.sendEvents;
        this.sendIncidents = $.sendIncidents;
        this.unknowns = $.unknowns;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationServiceNowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationServiceNowArgs $;

        public Builder() {
            $ = new NotificationServiceNowArgs();
        }

        public Builder(NotificationServiceNowArgs defaults) {
            $ = new NotificationServiceNowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active The configuration is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active The configuration is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param alertingProfile The ID of the associated alerting profile
         * 
         * @return builder
         * 
         */
        public Builder alertingProfile(Output<String> alertingProfile) {
            $.alertingProfile = alertingProfile;
            return this;
        }

        /**
         * @param alertingProfile The ID of the associated alerting profile
         * 
         * @return builder
         * 
         */
        public Builder alertingProfile(String alertingProfile) {
            return alertingProfile(Output.of(alertingProfile));
        }

        /**
         * @param instanceName The ServiceNow instance identifier. It refers to the first part of your own ServiceNow URL.   This field is mutually exclusive with the **url** field. You can only use one of them
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The ServiceNow instance identifier. It refers to the first part of your own ServiceNow URL.   This field is mutually exclusive with the **url** field. You can only use one of them
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param message The content of the ServiceNow description.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
         * 
         * @return builder
         * 
         */
        public Builder message(Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The content of the ServiceNow description.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param name The name of the notification configuration
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notification configuration
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The username to the ServiceNow account
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The username to the ServiceNow account
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param sendEvents Send events into ServiceNow ITOM (`true`)
         * 
         * @return builder
         * 
         */
        public Builder sendEvents(Output<Boolean> sendEvents) {
            $.sendEvents = sendEvents;
            return this;
        }

        /**
         * @param sendEvents Send events into ServiceNow ITOM (`true`)
         * 
         * @return builder
         * 
         */
        public Builder sendEvents(Boolean sendEvents) {
            return sendEvents(Output.of(sendEvents));
        }

        /**
         * @param sendIncidents Send incidents into ServiceNow ITSM (`true`)
         * 
         * @return builder
         * 
         */
        public Builder sendIncidents(Output<Boolean> sendIncidents) {
            $.sendIncidents = sendIncidents;
            return this;
        }

        /**
         * @param sendIncidents Send incidents into ServiceNow ITSM (`true`)
         * 
         * @return builder
         * 
         */
        public Builder sendIncidents(Boolean sendIncidents) {
            return sendIncidents(Output.of(sendIncidents));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        /**
         * @param url The URL of the on-premise ServiceNow installation.   This field is mutually exclusive with the **instanceName** field. You can only use one of them
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the on-premise ServiceNow installation.   This field is mutually exclusive with the **instanceName** field. You can only use one of them
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param username The username of the ServiceNow account.   Make sure that your user account has the `rest_service`, `web_request_admin`, and `x_dynat_ruxit.Integration` roles
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the ServiceNow account.   Make sure that your user account has the `rest_service`, `web_request_admin`, and `x_dynat_ruxit.Integration` roles
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public NotificationServiceNowArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.alertingProfile = Objects.requireNonNull($.alertingProfile, "expected parameter 'alertingProfile' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sendEvents = Objects.requireNonNull($.sendEvents, "expected parameter 'sendEvents' to be non-null");
            $.sendIncidents = Objects.requireNonNull($.sendIncidents, "expected parameter 'sendIncidents' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
