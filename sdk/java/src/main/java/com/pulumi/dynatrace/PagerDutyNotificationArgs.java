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


public final class PagerDutyNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagerDutyNotificationArgs Empty = new PagerDutyNotificationArgs();

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
     * The API key to access PagerDuty
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return The API key to access PagerDuty
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
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
     * The name of the PagerDuty Service
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The name of the PagerDuty Service
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private PagerDutyNotificationArgs() {}

    private PagerDutyNotificationArgs(PagerDutyNotificationArgs $) {
        this.account = $.account;
        this.active = $.active;
        this.apiKey = $.apiKey;
        this.name = $.name;
        this.profile = $.profile;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagerDutyNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagerDutyNotificationArgs $;

        public Builder() {
            $ = new PagerDutyNotificationArgs();
        }

        public Builder(PagerDutyNotificationArgs defaults) {
            $ = new PagerDutyNotificationArgs(Objects.requireNonNull(defaults));
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
         * @param apiKey The API key to access PagerDuty
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key to access PagerDuty
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
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
         * @param service The name of the PagerDuty Service
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The name of the PagerDuty Service
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public PagerDutyNotificationArgs build() {
            $.account = Objects.requireNonNull($.account, "expected parameter 'account' to be non-null");
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.profile = Objects.requireNonNull($.profile, "expected parameter 'profile' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
