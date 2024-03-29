// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.SessionReplayWebPrivacyMaskingPresetsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SessionReplayWebPrivacyState extends com.pulumi.resources.ResourceArgs {

    public static final SessionReplayWebPrivacyState Empty = new SessionReplayWebPrivacyState();

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
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) When [Session Replay opt-in mode](https://dt-url.net/sr-opt-in-mode) is turned on, Session Replay is deactivated until explicitly activated via an API call.
     * 
     */
    @Import(name="enableOptInMode")
    private @Nullable Output<Boolean> enableOptInMode;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) When [Session Replay opt-in mode](https://dt-url.net/sr-opt-in-mode) is turned on, Session Replay is deactivated until explicitly activated via an API call.
     * 
     */
    public Optional<Output<Boolean>> enableOptInMode() {
        return Optional.ofNullable(this.enableOptInMode);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To protect your end users&#39; privacy, select or customize [predefined masking options](https://dt-url.net/sr-masking-preset-options) that suit your content recording and playback requirements.
     * 
     */
    @Import(name="maskingPresets")
    private @Nullable Output<SessionReplayWebPrivacyMaskingPresetsArgs> maskingPresets;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To protect your end users&#39; privacy, select or customize [predefined masking options](https://dt-url.net/sr-masking-preset-options) that suit your content recording and playback requirements.
     * 
     */
    public Optional<Output<SessionReplayWebPrivacyMaskingPresetsArgs>> maskingPresets() {
        return Optional.ofNullable(this.maskingPresets);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Exclude webpages or views from Session Replay recording by adding [URL exclusion rules](https://dt-url.net/sr-url-exclusion)
     * 
     */
    @Import(name="urlExclusionPatternLists")
    private @Nullable Output<List<String>> urlExclusionPatternLists;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Exclude webpages or views from Session Replay recording by adding [URL exclusion rules](https://dt-url.net/sr-url-exclusion)
     * 
     */
    public Optional<Output<List<String>>> urlExclusionPatternLists() {
        return Optional.ofNullable(this.urlExclusionPatternLists);
    }

    private SessionReplayWebPrivacyState() {}

    private SessionReplayWebPrivacyState(SessionReplayWebPrivacyState $) {
        this.applicationId = $.applicationId;
        this.enableOptInMode = $.enableOptInMode;
        this.maskingPresets = $.maskingPresets;
        this.urlExclusionPatternLists = $.urlExclusionPatternLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SessionReplayWebPrivacyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SessionReplayWebPrivacyState $;

        public Builder() {
            $ = new SessionReplayWebPrivacyState();
        }

        public Builder(SessionReplayWebPrivacyState defaults) {
            $ = new SessionReplayWebPrivacyState(Objects.requireNonNull(defaults));
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
         * @param enableOptInMode (Field has overlap with `dynatrace.ApplicationDataPrivacy`) When [Session Replay opt-in mode](https://dt-url.net/sr-opt-in-mode) is turned on, Session Replay is deactivated until explicitly activated via an API call.
         * 
         * @return builder
         * 
         */
        public Builder enableOptInMode(@Nullable Output<Boolean> enableOptInMode) {
            $.enableOptInMode = enableOptInMode;
            return this;
        }

        /**
         * @param enableOptInMode (Field has overlap with `dynatrace.ApplicationDataPrivacy`) When [Session Replay opt-in mode](https://dt-url.net/sr-opt-in-mode) is turned on, Session Replay is deactivated until explicitly activated via an API call.
         * 
         * @return builder
         * 
         */
        public Builder enableOptInMode(Boolean enableOptInMode) {
            return enableOptInMode(Output.of(enableOptInMode));
        }

        /**
         * @param maskingPresets (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To protect your end users&#39; privacy, select or customize [predefined masking options](https://dt-url.net/sr-masking-preset-options) that suit your content recording and playback requirements.
         * 
         * @return builder
         * 
         */
        public Builder maskingPresets(@Nullable Output<SessionReplayWebPrivacyMaskingPresetsArgs> maskingPresets) {
            $.maskingPresets = maskingPresets;
            return this;
        }

        /**
         * @param maskingPresets (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To protect your end users&#39; privacy, select or customize [predefined masking options](https://dt-url.net/sr-masking-preset-options) that suit your content recording and playback requirements.
         * 
         * @return builder
         * 
         */
        public Builder maskingPresets(SessionReplayWebPrivacyMaskingPresetsArgs maskingPresets) {
            return maskingPresets(Output.of(maskingPresets));
        }

        /**
         * @param urlExclusionPatternLists (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Exclude webpages or views from Session Replay recording by adding [URL exclusion rules](https://dt-url.net/sr-url-exclusion)
         * 
         * @return builder
         * 
         */
        public Builder urlExclusionPatternLists(@Nullable Output<List<String>> urlExclusionPatternLists) {
            $.urlExclusionPatternLists = urlExclusionPatternLists;
            return this;
        }

        /**
         * @param urlExclusionPatternLists (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Exclude webpages or views from Session Replay recording by adding [URL exclusion rules](https://dt-url.net/sr-url-exclusion)
         * 
         * @return builder
         * 
         */
        public Builder urlExclusionPatternLists(List<String> urlExclusionPatternLists) {
            return urlExclusionPatternLists(Output.of(urlExclusionPatternLists));
        }

        /**
         * @param urlExclusionPatternLists (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Exclude webpages or views from Session Replay recording by adding [URL exclusion rules](https://dt-url.net/sr-url-exclusion)
         * 
         * @return builder
         * 
         */
        public Builder urlExclusionPatternLists(String... urlExclusionPatternLists) {
            return urlExclusionPatternLists(List.of(urlExclusionPatternLists));
        }

        public SessionReplayWebPrivacyState build() {
            return $;
        }
    }

}
