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


public final class OpsGenieNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpsGenieNotificationArgs Empty = new OpsGenieNotificationArgs();

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
     * The API key to access OpsGenie
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return The API key to access OpsGenie
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * The region domain of the OpsGenie
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The region domain of the OpsGenie
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    @Import(name="legacyId")
    private @Nullable Output<String> legacyId;

    /**
     * @return The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    public Optional<Output<String>> legacyId() {
        return Optional.ofNullable(this.legacyId);
    }

    /**
     * The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
     * 
     */
    @Import(name="message", required=true)
    private Output<String> message;

    /**
     * @return The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
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

    private OpsGenieNotificationArgs() {}

    private OpsGenieNotificationArgs(OpsGenieNotificationArgs $) {
        this.active = $.active;
        this.apiKey = $.apiKey;
        this.domain = $.domain;
        this.legacyId = $.legacyId;
        this.message = $.message;
        this.name = $.name;
        this.profile = $.profile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpsGenieNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpsGenieNotificationArgs $;

        public Builder() {
            $ = new OpsGenieNotificationArgs();
        }

        public Builder(OpsGenieNotificationArgs defaults) {
            $ = new OpsGenieNotificationArgs(Objects.requireNonNull(defaults));
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
         * @param apiKey The API key to access OpsGenie
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key to access OpsGenie
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param domain The region domain of the OpsGenie
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The region domain of the OpsGenie
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param legacyId The ID of these settings when referred to from resources requiring the REST API V1 keys
         * 
         * @return builder
         * 
         */
        public Builder legacyId(@Nullable Output<String> legacyId) {
            $.legacyId = legacyId;
            return this;
        }

        /**
         * @param legacyId The ID of these settings when referred to from resources requiring the REST API V1 keys
         * 
         * @return builder
         * 
         */
        public Builder legacyId(String legacyId) {
            return legacyId(Output.of(legacyId));
        }

        /**
         * @param message The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
         * 
         * @return builder
         * 
         */
        public Builder message(Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
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

        public OpsGenieNotificationArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.profile = Objects.requireNonNull($.profile, "expected parameter 'profile' to be non-null");
            return $;
        }
    }

}
