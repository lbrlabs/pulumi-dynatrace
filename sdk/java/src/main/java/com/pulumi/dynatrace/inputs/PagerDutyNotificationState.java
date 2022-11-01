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


public final class PagerDutyNotificationState extends com.pulumi.resources.ResourceArgs {

    public static final PagerDutyNotificationState Empty = new PagerDutyNotificationState();

    /**
     * The name of the PagerDuty account
     * 
     */
    @Import(name="account")
    private @Nullable Output<String> account;

    /**
     * @return The name of the PagerDuty account
     * 
     */
    public Optional<Output<String>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
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
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return The ID of the associated alerting profile
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * The name of the PagerDuty Service
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The name of the PagerDuty Service
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private PagerDutyNotificationState() {}

    private PagerDutyNotificationState(PagerDutyNotificationState $) {
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
    public static Builder builder(PagerDutyNotificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagerDutyNotificationState $;

        public Builder() {
            $ = new PagerDutyNotificationState();
        }

        public Builder(PagerDutyNotificationState defaults) {
            $ = new PagerDutyNotificationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param account The name of the PagerDuty account
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<String> account) {
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
        public Builder active(@Nullable Output<Boolean> active) {
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
        public Builder profile(@Nullable Output<String> profile) {
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
        public Builder service(@Nullable Output<String> service) {
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

        public PagerDutyNotificationState build() {
            return $;
        }
    }

}
