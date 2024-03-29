// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SessionReplayResourceCaptureState extends com.pulumi.resources.ResourceArgs {

    public static final SessionReplayResourceCaptureState Empty = new SessionReplayResourceCaptureState();

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
     * (Field has overlap with `dynatrace.WebApplication`) When turned on, all CSS resources from all sessions are captured. For details, see [Resource capture](https://dt-url.net/sr-resource-capturing).
     * 
     */
    @Import(name="enableResourceCapturing")
    private @Nullable Output<Boolean> enableResourceCapturing;

    /**
     * @return (Field has overlap with `dynatrace.WebApplication`) When turned on, all CSS resources from all sessions are captured. For details, see [Resource capture](https://dt-url.net/sr-resource-capturing).
     * 
     */
    public Optional<Output<Boolean>> enableResourceCapturing() {
        return Optional.ofNullable(this.enableResourceCapturing);
    }

    /**
     * (Field has overlap with `dynatrace.WebApplication`) Add exclusion rules to avoid the capture of resources from certain pages.
     * 
     */
    @Import(name="resourceCaptureUrlExclusionPatternLists")
    private @Nullable Output<List<String>> resourceCaptureUrlExclusionPatternLists;

    /**
     * @return (Field has overlap with `dynatrace.WebApplication`) Add exclusion rules to avoid the capture of resources from certain pages.
     * 
     */
    public Optional<Output<List<String>>> resourceCaptureUrlExclusionPatternLists() {
        return Optional.ofNullable(this.resourceCaptureUrlExclusionPatternLists);
    }

    private SessionReplayResourceCaptureState() {}

    private SessionReplayResourceCaptureState(SessionReplayResourceCaptureState $) {
        this.applicationId = $.applicationId;
        this.enableResourceCapturing = $.enableResourceCapturing;
        this.resourceCaptureUrlExclusionPatternLists = $.resourceCaptureUrlExclusionPatternLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SessionReplayResourceCaptureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SessionReplayResourceCaptureState $;

        public Builder() {
            $ = new SessionReplayResourceCaptureState();
        }

        public Builder(SessionReplayResourceCaptureState defaults) {
            $ = new SessionReplayResourceCaptureState(Objects.requireNonNull(defaults));
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
         * @param enableResourceCapturing (Field has overlap with `dynatrace.WebApplication`) When turned on, all CSS resources from all sessions are captured. For details, see [Resource capture](https://dt-url.net/sr-resource-capturing).
         * 
         * @return builder
         * 
         */
        public Builder enableResourceCapturing(@Nullable Output<Boolean> enableResourceCapturing) {
            $.enableResourceCapturing = enableResourceCapturing;
            return this;
        }

        /**
         * @param enableResourceCapturing (Field has overlap with `dynatrace.WebApplication`) When turned on, all CSS resources from all sessions are captured. For details, see [Resource capture](https://dt-url.net/sr-resource-capturing).
         * 
         * @return builder
         * 
         */
        public Builder enableResourceCapturing(Boolean enableResourceCapturing) {
            return enableResourceCapturing(Output.of(enableResourceCapturing));
        }

        /**
         * @param resourceCaptureUrlExclusionPatternLists (Field has overlap with `dynatrace.WebApplication`) Add exclusion rules to avoid the capture of resources from certain pages.
         * 
         * @return builder
         * 
         */
        public Builder resourceCaptureUrlExclusionPatternLists(@Nullable Output<List<String>> resourceCaptureUrlExclusionPatternLists) {
            $.resourceCaptureUrlExclusionPatternLists = resourceCaptureUrlExclusionPatternLists;
            return this;
        }

        /**
         * @param resourceCaptureUrlExclusionPatternLists (Field has overlap with `dynatrace.WebApplication`) Add exclusion rules to avoid the capture of resources from certain pages.
         * 
         * @return builder
         * 
         */
        public Builder resourceCaptureUrlExclusionPatternLists(List<String> resourceCaptureUrlExclusionPatternLists) {
            return resourceCaptureUrlExclusionPatternLists(Output.of(resourceCaptureUrlExclusionPatternLists));
        }

        /**
         * @param resourceCaptureUrlExclusionPatternLists (Field has overlap with `dynatrace.WebApplication`) Add exclusion rules to avoid the capture of resources from certain pages.
         * 
         * @return builder
         * 
         */
        public Builder resourceCaptureUrlExclusionPatternLists(String... resourceCaptureUrlExclusionPatternLists) {
            return resourceCaptureUrlExclusionPatternLists(List.of(resourceCaptureUrlExclusionPatternLists));
        }

        public SessionReplayResourceCaptureState build() {
            return $;
        }
    }

}
