// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MobileApplicationApdexArgs;
import com.pulumi.dynatrace.inputs.MobileApplicationPropertiesArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MobileApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MobileApplicationArgs Empty = new MobileApplicationArgs();

    /**
     * Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
     * 
     */
    @Import(name="apdex", required=true)
    private Output<MobileApplicationApdexArgs> apdex;

    /**
     * @return Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
     * 
     */
    public Output<MobileApplicationApdexArgs> apdex() {
        return this.apdex;
    }

    /**
     * The UUID of the application.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The UUID of the application.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The type of the application. Either `CUSTOM_APPLICATION` or `MOBILE_APPLICATION`.
     * 
     */
    @Import(name="applicationType")
    private @Nullable Output<String> applicationType;

    /**
     * @return The type of the application. Either `CUSTOM_APPLICATION` or `MOBILE_APPLICATION`.
     * 
     */
    public Optional<Output<String>> applicationType() {
        return Optional.ofNullable(this.applicationType);
    }

    /**
     * The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
     * 
     */
    @Import(name="beaconEndpointType", required=true)
    private Output<String> beaconEndpointType;

    /**
     * @return The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
     * 
     */
    public Output<String> beaconEndpointType() {
        return this.beaconEndpointType;
    }

    /**
     * The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
     * `INSTRUMENTED_WEB_SERVER`
     * 
     */
    @Import(name="beaconEndpointUrl")
    private @Nullable Output<String> beaconEndpointUrl;

    /**
     * @return The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
     * `INSTRUMENTED_WEB_SERVER`
     * 
     */
    public Optional<Output<String>> beaconEndpointUrl() {
        return Optional.ofNullable(this.beaconEndpointUrl);
    }

    /**
     * Custom application icon. Mobile apps always use the mobile device icon, so this icon can only be set for custom apps.
     * 
     */
    @Import(name="iconType")
    private @Nullable Output<String> iconType;

    /**
     * @return Custom application icon. Mobile apps always use the mobile device icon, so this icon can only be set for custom apps.
     * 
     */
    public Optional<Output<String>> iconType() {
        return Optional.ofNullable(this.iconType);
    }

    /**
     * User Action names to be flagged as Key User Actions
     * 
     */
    @Import(name="keyUserActions")
    private @Nullable Output<List<String>> keyUserActions;

    /**
     * @return User Action names to be flagged as Key User Actions
     * 
     */
    public Optional<Output<List<String>>> keyUserActions() {
        return Optional.ofNullable(this.keyUserActions);
    }

    /**
     * The name of the application
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the application
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The opt-in mode is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="optInMode")
    private @Nullable Output<Boolean> optInMode;

    /**
     * @return The opt-in mode is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> optInMode() {
        return Optional.ofNullable(this.optInMode);
    }

    /**
     * User Action and Session Properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<MobileApplicationPropertiesArgs> properties;

    /**
     * @return User Action and Session Properties
     * 
     */
    public Optional<Output<MobileApplicationPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * (Field has overlap with `dynatrace_mobile_app_enablement`) The session replay is enabled (`true`) or disabled (`false`).
     * 
     */
    @Import(name="sessionReplay")
    private @Nullable Output<Boolean> sessionReplay;

    /**
     * @return (Field has overlap with `dynatrace_mobile_app_enablement`) The session replay is enabled (`true`) or disabled (`false`).
     * 
     */
    public Optional<Output<Boolean>> sessionReplay() {
        return Optional.ofNullable(this.sessionReplay);
    }

    /**
     * The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
     * and **optInModeEnabled** values set to `true`.
     * 
     */
    @Import(name="sessionReplayOnCrash")
    private @Nullable Output<Boolean> sessionReplayOnCrash;

    /**
     * @return The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
     * and **optInModeEnabled** values set to `true`.
     * 
     */
    public Optional<Output<Boolean>> sessionReplayOnCrash() {
        return Optional.ofNullable(this.sessionReplayOnCrash);
    }

    /**
     * (Field has overlap with `dynatrace_mobile_app_enablement` for mobile and `dynatrace_custom_app_enablement` for custom
     * apps) The percentage of user sessions to be analyzed
     * 
     */
    @Import(name="userSessionPercentage")
    private @Nullable Output<Integer> userSessionPercentage;

    /**
     * @return (Field has overlap with `dynatrace_mobile_app_enablement` for mobile and `dynatrace_custom_app_enablement` for custom
     * apps) The percentage of user sessions to be analyzed
     * 
     */
    public Optional<Output<Integer>> userSessionPercentage() {
        return Optional.ofNullable(this.userSessionPercentage);
    }

    private MobileApplicationArgs() {}

    private MobileApplicationArgs(MobileApplicationArgs $) {
        this.apdex = $.apdex;
        this.applicationId = $.applicationId;
        this.applicationType = $.applicationType;
        this.beaconEndpointType = $.beaconEndpointType;
        this.beaconEndpointUrl = $.beaconEndpointUrl;
        this.iconType = $.iconType;
        this.keyUserActions = $.keyUserActions;
        this.name = $.name;
        this.optInMode = $.optInMode;
        this.properties = $.properties;
        this.sessionReplay = $.sessionReplay;
        this.sessionReplayOnCrash = $.sessionReplayOnCrash;
        this.userSessionPercentage = $.userSessionPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MobileApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MobileApplicationArgs $;

        public Builder() {
            $ = new MobileApplicationArgs();
        }

        public Builder(MobileApplicationArgs defaults) {
            $ = new MobileApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apdex Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
         * 
         * @return builder
         * 
         */
        public Builder apdex(Output<MobileApplicationApdexArgs> apdex) {
            $.apdex = apdex;
            return this;
        }

        /**
         * @param apdex Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
         * 
         * @return builder
         * 
         */
        public Builder apdex(MobileApplicationApdexArgs apdex) {
            return apdex(Output.of(apdex));
        }

        /**
         * @param applicationId The UUID of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The UUID of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param applicationType The type of the application. Either `CUSTOM_APPLICATION` or `MOBILE_APPLICATION`.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(@Nullable Output<String> applicationType) {
            $.applicationType = applicationType;
            return this;
        }

        /**
         * @param applicationType The type of the application. Either `CUSTOM_APPLICATION` or `MOBILE_APPLICATION`.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(String applicationType) {
            return applicationType(Output.of(applicationType));
        }

        /**
         * @param beaconEndpointType The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
         * 
         * @return builder
         * 
         */
        public Builder beaconEndpointType(Output<String> beaconEndpointType) {
            $.beaconEndpointType = beaconEndpointType;
            return this;
        }

        /**
         * @param beaconEndpointType The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
         * 
         * @return builder
         * 
         */
        public Builder beaconEndpointType(String beaconEndpointType) {
            return beaconEndpointType(Output.of(beaconEndpointType));
        }

        /**
         * @param beaconEndpointUrl The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
         * `INSTRUMENTED_WEB_SERVER`
         * 
         * @return builder
         * 
         */
        public Builder beaconEndpointUrl(@Nullable Output<String> beaconEndpointUrl) {
            $.beaconEndpointUrl = beaconEndpointUrl;
            return this;
        }

        /**
         * @param beaconEndpointUrl The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
         * `INSTRUMENTED_WEB_SERVER`
         * 
         * @return builder
         * 
         */
        public Builder beaconEndpointUrl(String beaconEndpointUrl) {
            return beaconEndpointUrl(Output.of(beaconEndpointUrl));
        }

        /**
         * @param iconType Custom application icon. Mobile apps always use the mobile device icon, so this icon can only be set for custom apps.
         * 
         * @return builder
         * 
         */
        public Builder iconType(@Nullable Output<String> iconType) {
            $.iconType = iconType;
            return this;
        }

        /**
         * @param iconType Custom application icon. Mobile apps always use the mobile device icon, so this icon can only be set for custom apps.
         * 
         * @return builder
         * 
         */
        public Builder iconType(String iconType) {
            return iconType(Output.of(iconType));
        }

        /**
         * @param keyUserActions User Action names to be flagged as Key User Actions
         * 
         * @return builder
         * 
         */
        public Builder keyUserActions(@Nullable Output<List<String>> keyUserActions) {
            $.keyUserActions = keyUserActions;
            return this;
        }

        /**
         * @param keyUserActions User Action names to be flagged as Key User Actions
         * 
         * @return builder
         * 
         */
        public Builder keyUserActions(List<String> keyUserActions) {
            return keyUserActions(Output.of(keyUserActions));
        }

        /**
         * @param keyUserActions User Action names to be flagged as Key User Actions
         * 
         * @return builder
         * 
         */
        public Builder keyUserActions(String... keyUserActions) {
            return keyUserActions(List.of(keyUserActions));
        }

        /**
         * @param name The name of the application
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the application
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optInMode The opt-in mode is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder optInMode(@Nullable Output<Boolean> optInMode) {
            $.optInMode = optInMode;
            return this;
        }

        /**
         * @param optInMode The opt-in mode is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder optInMode(Boolean optInMode) {
            return optInMode(Output.of(optInMode));
        }

        /**
         * @param properties User Action and Session Properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<MobileApplicationPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties User Action and Session Properties
         * 
         * @return builder
         * 
         */
        public Builder properties(MobileApplicationPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param sessionReplay (Field has overlap with `dynatrace_mobile_app_enablement`) The session replay is enabled (`true`) or disabled (`false`).
         * 
         * @return builder
         * 
         */
        public Builder sessionReplay(@Nullable Output<Boolean> sessionReplay) {
            $.sessionReplay = sessionReplay;
            return this;
        }

        /**
         * @param sessionReplay (Field has overlap with `dynatrace_mobile_app_enablement`) The session replay is enabled (`true`) or disabled (`false`).
         * 
         * @return builder
         * 
         */
        public Builder sessionReplay(Boolean sessionReplay) {
            return sessionReplay(Output.of(sessionReplay));
        }

        /**
         * @param sessionReplayOnCrash The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
         * and **optInModeEnabled** values set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder sessionReplayOnCrash(@Nullable Output<Boolean> sessionReplayOnCrash) {
            $.sessionReplayOnCrash = sessionReplayOnCrash;
            return this;
        }

        /**
         * @param sessionReplayOnCrash The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
         * and **optInModeEnabled** values set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder sessionReplayOnCrash(Boolean sessionReplayOnCrash) {
            return sessionReplayOnCrash(Output.of(sessionReplayOnCrash));
        }

        /**
         * @param userSessionPercentage (Field has overlap with `dynatrace_mobile_app_enablement` for mobile and `dynatrace_custom_app_enablement` for custom
         * apps) The percentage of user sessions to be analyzed
         * 
         * @return builder
         * 
         */
        public Builder userSessionPercentage(@Nullable Output<Integer> userSessionPercentage) {
            $.userSessionPercentage = userSessionPercentage;
            return this;
        }

        /**
         * @param userSessionPercentage (Field has overlap with `dynatrace_mobile_app_enablement` for mobile and `dynatrace_custom_app_enablement` for custom
         * apps) The percentage of user sessions to be analyzed
         * 
         * @return builder
         * 
         */
        public Builder userSessionPercentage(Integer userSessionPercentage) {
            return userSessionPercentage(Output.of(userSessionPercentage));
        }

        public MobileApplicationArgs build() {
            $.apdex = Objects.requireNonNull($.apdex, "expected parameter 'apdex' to be non-null");
            $.beaconEndpointType = Objects.requireNonNull($.beaconEndpointType, "expected parameter 'beaconEndpointType' to be non-null");
            return $;
        }
    }

}
