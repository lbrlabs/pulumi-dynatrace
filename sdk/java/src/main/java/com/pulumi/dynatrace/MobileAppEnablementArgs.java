// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MobileAppEnablementRumArgs;
import com.pulumi.dynatrace.inputs.MobileAppEnablementSessionReplayArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MobileAppEnablementArgs extends com.pulumi.resources.ResourceArgs {

    public static final MobileAppEnablementArgs Empty = new MobileAppEnablementArgs();

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * (Field has overlap with `dynatrace.MobileApplication`) Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
     * 
     */
    @Import(name="rum", required=true)
    private Output<MobileAppEnablementRumArgs> rum;

    /**
     * @return (Field has overlap with `dynatrace.MobileApplication`) Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
     * 
     */
    public Output<MobileAppEnablementRumArgs> rum() {
        return this.rum;
    }

    /**
     * (Field has overlap with `dynatrace.MobileApplication`) [Session Replay on crashes](https://dt-url.net/session-replay) gives you additional context for crash analysis in the form of video-like screen recordings that replay user actions immediately preceding a detected crash, while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     * 
     */
    @Import(name="sessionReplay", required=true)
    private Output<MobileAppEnablementSessionReplayArgs> sessionReplay;

    /**
     * @return (Field has overlap with `dynatrace.MobileApplication`) [Session Replay on crashes](https://dt-url.net/session-replay) gives you additional context for crash analysis in the form of video-like screen recordings that replay user actions immediately preceding a detected crash, while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     * 
     */
    public Output<MobileAppEnablementSessionReplayArgs> sessionReplay() {
        return this.sessionReplay;
    }

    private MobileAppEnablementArgs() {}

    private MobileAppEnablementArgs(MobileAppEnablementArgs $) {
        this.applicationId = $.applicationId;
        this.rum = $.rum;
        this.sessionReplay = $.sessionReplay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MobileAppEnablementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MobileAppEnablementArgs $;

        public Builder() {
            $ = new MobileAppEnablementArgs();
        }

        public Builder(MobileAppEnablementArgs defaults) {
            $ = new MobileAppEnablementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param rum (Field has overlap with `dynatrace.MobileApplication`) Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
         * 
         * @return builder
         * 
         */
        public Builder rum(Output<MobileAppEnablementRumArgs> rum) {
            $.rum = rum;
            return this;
        }

        /**
         * @param rum (Field has overlap with `dynatrace.MobileApplication`) Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
         * 
         * @return builder
         * 
         */
        public Builder rum(MobileAppEnablementRumArgs rum) {
            return rum(Output.of(rum));
        }

        /**
         * @param sessionReplay (Field has overlap with `dynatrace.MobileApplication`) [Session Replay on crashes](https://dt-url.net/session-replay) gives you additional context for crash analysis in the form of video-like screen recordings that replay user actions immediately preceding a detected crash, while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
         * 
         * @return builder
         * 
         */
        public Builder sessionReplay(Output<MobileAppEnablementSessionReplayArgs> sessionReplay) {
            $.sessionReplay = sessionReplay;
            return this;
        }

        /**
         * @param sessionReplay (Field has overlap with `dynatrace.MobileApplication`) [Session Replay on crashes](https://dt-url.net/session-replay) gives you additional context for crash analysis in the form of video-like screen recordings that replay user actions immediately preceding a detected crash, while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
         * 
         * @return builder
         * 
         */
        public Builder sessionReplay(MobileAppEnablementSessionReplayArgs sessionReplay) {
            return sessionReplay(Output.of(sessionReplay));
        }

        public MobileAppEnablementArgs build() {
            $.rum = Objects.requireNonNull($.rum, "expected parameter 'rum' to be non-null");
            $.sessionReplay = Objects.requireNonNull($.sessionReplay, "expected parameter 'sessionReplay' to be non-null");
            return $;
        }
    }

}
