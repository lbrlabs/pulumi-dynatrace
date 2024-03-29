// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ApplicationDataPrivacySessionReplayDataPrivacyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationDataPrivacyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDataPrivacyArgs Empty = new ApplicationDataPrivacyArgs();

    /**
     * (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
     * 
     */
    @Import(name="dataCaptureOptIn")
    private @Nullable Output<Boolean> dataCaptureOptIn;

    /**
     * @return (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
     * 
     */
    public Optional<Output<Boolean>> dataCaptureOptIn() {
        return Optional.ofNullable(this.dataCaptureOptIn);
    }

    /**
     * (Field has overlap with `dynatrace.DataPrivacy`) How to handle the &#34;Do Not Track&#34; header:
     * 
     */
    @Import(name="doNotTrackBehaviour", required=true)
    private Output<String> doNotTrackBehaviour;

    /**
     * @return (Field has overlap with `dynatrace.DataPrivacy`) How to handle the &#34;Do Not Track&#34; header:
     * 
     */
    public Output<String> doNotTrackBehaviour() {
        return this.doNotTrackBehaviour;
    }

    /**
     * (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
     * 
     */
    @Import(name="persistentCookieForUserTracking")
    private @Nullable Output<Boolean> persistentCookieForUserTracking;

    /**
     * @return (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
     * 
     */
    public Optional<Output<Boolean>> persistentCookieForUserTracking() {
        return Optional.ofNullable(this.persistentCookieForUserTracking);
    }

    /**
     * (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Data privacy settings for Session Replay
     * 
     */
    @Import(name="sessionReplayDataPrivacy", required=true)
    private Output<ApplicationDataPrivacySessionReplayDataPrivacyArgs> sessionReplayDataPrivacy;

    /**
     * @return (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Data privacy settings for Session Replay
     * 
     */
    public Output<ApplicationDataPrivacySessionReplayDataPrivacyArgs> sessionReplayDataPrivacy() {
        return this.sessionReplayDataPrivacy;
    }

    /**
     * Dynatrace entity ID of the web application
     * 
     */
    @Import(name="webApplicationId", required=true)
    private Output<String> webApplicationId;

    /**
     * @return Dynatrace entity ID of the web application
     * 
     */
    public Output<String> webApplicationId() {
        return this.webApplicationId;
    }

    private ApplicationDataPrivacyArgs() {}

    private ApplicationDataPrivacyArgs(ApplicationDataPrivacyArgs $) {
        this.dataCaptureOptIn = $.dataCaptureOptIn;
        this.doNotTrackBehaviour = $.doNotTrackBehaviour;
        this.persistentCookieForUserTracking = $.persistentCookieForUserTracking;
        this.sessionReplayDataPrivacy = $.sessionReplayDataPrivacy;
        this.webApplicationId = $.webApplicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDataPrivacyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDataPrivacyArgs $;

        public Builder() {
            $ = new ApplicationDataPrivacyArgs();
        }

        public Builder(ApplicationDataPrivacyArgs defaults) {
            $ = new ApplicationDataPrivacyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataCaptureOptIn (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
         * 
         * @return builder
         * 
         */
        public Builder dataCaptureOptIn(@Nullable Output<Boolean> dataCaptureOptIn) {
            $.dataCaptureOptIn = dataCaptureOptIn;
            return this;
        }

        /**
         * @param dataCaptureOptIn (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
         * 
         * @return builder
         * 
         */
        public Builder dataCaptureOptIn(Boolean dataCaptureOptIn) {
            return dataCaptureOptIn(Output.of(dataCaptureOptIn));
        }

        /**
         * @param doNotTrackBehaviour (Field has overlap with `dynatrace.DataPrivacy`) How to handle the &#34;Do Not Track&#34; header:
         * 
         * @return builder
         * 
         */
        public Builder doNotTrackBehaviour(Output<String> doNotTrackBehaviour) {
            $.doNotTrackBehaviour = doNotTrackBehaviour;
            return this;
        }

        /**
         * @param doNotTrackBehaviour (Field has overlap with `dynatrace.DataPrivacy`) How to handle the &#34;Do Not Track&#34; header:
         * 
         * @return builder
         * 
         */
        public Builder doNotTrackBehaviour(String doNotTrackBehaviour) {
            return doNotTrackBehaviour(Output.of(doNotTrackBehaviour));
        }

        /**
         * @param persistentCookieForUserTracking (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
         * 
         * @return builder
         * 
         */
        public Builder persistentCookieForUserTracking(@Nullable Output<Boolean> persistentCookieForUserTracking) {
            $.persistentCookieForUserTracking = persistentCookieForUserTracking;
            return this;
        }

        /**
         * @param persistentCookieForUserTracking (Field has overlap with `dynatrace.DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
         * 
         * @return builder
         * 
         */
        public Builder persistentCookieForUserTracking(Boolean persistentCookieForUserTracking) {
            return persistentCookieForUserTracking(Output.of(persistentCookieForUserTracking));
        }

        /**
         * @param sessionReplayDataPrivacy (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Data privacy settings for Session Replay
         * 
         * @return builder
         * 
         */
        public Builder sessionReplayDataPrivacy(Output<ApplicationDataPrivacySessionReplayDataPrivacyArgs> sessionReplayDataPrivacy) {
            $.sessionReplayDataPrivacy = sessionReplayDataPrivacy;
            return this;
        }

        /**
         * @param sessionReplayDataPrivacy (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Data privacy settings for Session Replay
         * 
         * @return builder
         * 
         */
        public Builder sessionReplayDataPrivacy(ApplicationDataPrivacySessionReplayDataPrivacyArgs sessionReplayDataPrivacy) {
            return sessionReplayDataPrivacy(Output.of(sessionReplayDataPrivacy));
        }

        /**
         * @param webApplicationId Dynatrace entity ID of the web application
         * 
         * @return builder
         * 
         */
        public Builder webApplicationId(Output<String> webApplicationId) {
            $.webApplicationId = webApplicationId;
            return this;
        }

        /**
         * @param webApplicationId Dynatrace entity ID of the web application
         * 
         * @return builder
         * 
         */
        public Builder webApplicationId(String webApplicationId) {
            return webApplicationId(Output.of(webApplicationId));
        }

        public ApplicationDataPrivacyArgs build() {
            $.doNotTrackBehaviour = Objects.requireNonNull($.doNotTrackBehaviour, "expected parameter 'doNotTrackBehaviour' to be non-null");
            $.sessionReplayDataPrivacy = Objects.requireNonNull($.sessionReplayDataPrivacy, "expected parameter 'sessionReplayDataPrivacy' to be non-null");
            $.webApplicationId = Objects.requireNonNull($.webApplicationId, "expected parameter 'webApplicationId' to be non-null");
            return $;
        }
    }

}
