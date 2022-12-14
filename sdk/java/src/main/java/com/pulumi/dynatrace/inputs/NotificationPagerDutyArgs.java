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


public final class NotificationPagerDutyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPagerDutyArgs Empty = new NotificationPagerDutyArgs();

    /**
     * The name of the PagerDuty account
     * 
     */
    @Import(name="account", required=true)
    private Output<String> account;

    /**
     * @return The name of the PagerDuty account
     * 
     */
    public Output<String> account() {
        return this.account;
    }

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
     * The API key to access PagerDuty
     * 
     */
    @Import(name="serviceApiKey")
    private @Nullable Output<String> serviceApiKey;

    /**
     * @return The API key to access PagerDuty
     * 
     */
    public Optional<Output<String>> serviceApiKey() {
        return Optional.ofNullable(this.serviceApiKey);
    }

    /**
     * The name of the service
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the service
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
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

    private NotificationPagerDutyArgs() {}

    private NotificationPagerDutyArgs(NotificationPagerDutyArgs $) {
        this.account = $.account;
        this.active = $.active;
        this.alertingProfile = $.alertingProfile;
        this.name = $.name;
        this.serviceApiKey = $.serviceApiKey;
        this.serviceName = $.serviceName;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPagerDutyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPagerDutyArgs $;

        public Builder() {
            $ = new NotificationPagerDutyArgs();
        }

        public Builder(NotificationPagerDutyArgs defaults) {
            $ = new NotificationPagerDutyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account The name of the PagerDuty account
         * 
         * @return builder
         * 
         */
        public Builder account(Output<String> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account The name of the PagerDuty account
         * 
         * @return builder
         * 
         */
        public Builder account(String account) {
            return account(Output.of(account));
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
         * @param serviceApiKey The API key to access PagerDuty
         * 
         * @return builder
         * 
         */
        public Builder serviceApiKey(@Nullable Output<String> serviceApiKey) {
            $.serviceApiKey = serviceApiKey;
            return this;
        }

        /**
         * @param serviceApiKey The API key to access PagerDuty
         * 
         * @return builder
         * 
         */
        public Builder serviceApiKey(String serviceApiKey) {
            return serviceApiKey(Output.of(serviceApiKey));
        }

        /**
         * @param serviceName The name of the service
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
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

        public NotificationPagerDutyArgs build() {
            $.account = Objects.requireNonNull($.account, "expected parameter 'account' to be non-null");
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.alertingProfile = Objects.requireNonNull($.alertingProfile, "expected parameter 'alertingProfile' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
