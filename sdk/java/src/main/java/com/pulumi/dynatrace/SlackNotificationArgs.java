// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlackNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlackNotificationArgs Empty = new SlackNotificationArgs();

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
     * The channel (for example, `#general`) or the user (for example, `@john.smith`) to send the message to
     * 
     */
    @Import(name="channel", required=true)
    private Output<String> channel;

    /**
     * @return The channel (for example, `#general`) or the user (for example, `@john.smith`) to send the message to
     * 
     */
    public Output<String> channel() {
        return this.channel;
    }

    /**
     * The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    @Import(name="message", required=true)
    private Output<String> message;

    /**
     * @return The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    public Output<String> message() {
        return this.message;
    }

    /**
     * The name of the notification configuration
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the notification configuration
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the associated alerting profile
     * 
     */
    @Import(name="profile", required=true)
    private Output<String> profile;

    /**
     * @return The ID of the associated alerting profile
     * 
     */
    public Output<String> profile() {
        return this.profile;
    }

    /**
     * The URL of the Slack WebHook. This is confidential information, therefore GET requests return this field with the `null` value, and it is optional for PUT requests
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL of the Slack WebHook. This is confidential information, therefore GET requests return this field with the `null` value, and it is optional for PUT requests
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private SlackNotificationArgs() {}

    private SlackNotificationArgs(SlackNotificationArgs $) {
        this.active = $.active;
        this.channel = $.channel;
        this.message = $.message;
        this.name = $.name;
        this.profile = $.profile;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlackNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlackNotificationArgs $;

        public Builder() {
            $ = new SlackNotificationArgs();
        }

        public Builder(SlackNotificationArgs defaults) {
            $ = new SlackNotificationArgs(Objects.requireNonNull(defaults));
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
         * @param channel The channel (for example, `#general`) or the user (for example, `@john.smith`) to send the message to
         * 
         * @return builder
         * 
         */
        public Builder channel(Output<String> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel The channel (for example, `#general`) or the user (for example, `@john.smith`) to send the message to
         * 
         * @return builder
         * 
         */
        public Builder channel(String channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param message The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
         * 
         * @return builder
         * 
         */
        public Builder message(Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
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
        public Builder name(@Nullable Output<String> name) {
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
         * @param profile The ID of the associated alerting profile
         * 
         * @return builder
         * 
         */
        public Builder profile(Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile The ID of the associated alerting profile
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param url The URL of the Slack WebHook. This is confidential information, therefore GET requests return this field with the `null` value, and it is optional for PUT requests
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the Slack WebHook. This is confidential information, therefore GET requests return this field with the `null` value, and it is optional for PUT requests
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SlackNotificationArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.channel = Objects.requireNonNull($.channel, "expected parameter 'channel' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.profile = Objects.requireNonNull($.profile, "expected parameter 'profile' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
