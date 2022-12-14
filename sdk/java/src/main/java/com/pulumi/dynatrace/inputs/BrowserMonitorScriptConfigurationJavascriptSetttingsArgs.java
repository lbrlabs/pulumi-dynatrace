// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettingsArgs;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptConfigurationJavascriptSetttingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptConfigurationJavascriptSetttingsArgs Empty = new BrowserMonitorScriptConfigurationJavascriptSetttingsArgs();

    @Import(name="customProperties")
    private @Nullable Output<String> customProperties;

    public Optional<Output<String>> customProperties() {
        return Optional.ofNullable(this.customProperties);
    }

    @Import(name="timeoutSettings")
    private @Nullable Output<BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettingsArgs> timeoutSettings;

    public Optional<Output<BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettingsArgs>> timeoutSettings() {
        return Optional.ofNullable(this.timeoutSettings);
    }

    @Import(name="visuallyCompleteOptions")
    private @Nullable Output<BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptionsArgs> visuallyCompleteOptions;

    public Optional<Output<BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptionsArgs>> visuallyCompleteOptions() {
        return Optional.ofNullable(this.visuallyCompleteOptions);
    }

    private BrowserMonitorScriptConfigurationJavascriptSetttingsArgs() {}

    private BrowserMonitorScriptConfigurationJavascriptSetttingsArgs(BrowserMonitorScriptConfigurationJavascriptSetttingsArgs $) {
        this.customProperties = $.customProperties;
        this.timeoutSettings = $.timeoutSettings;
        this.visuallyCompleteOptions = $.visuallyCompleteOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptConfigurationJavascriptSetttingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptConfigurationJavascriptSetttingsArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptConfigurationJavascriptSetttingsArgs();
        }

        public Builder(BrowserMonitorScriptConfigurationJavascriptSetttingsArgs defaults) {
            $ = new BrowserMonitorScriptConfigurationJavascriptSetttingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customProperties(@Nullable Output<String> customProperties) {
            $.customProperties = customProperties;
            return this;
        }

        public Builder customProperties(String customProperties) {
            return customProperties(Output.of(customProperties));
        }

        public Builder timeoutSettings(@Nullable Output<BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettingsArgs> timeoutSettings) {
            $.timeoutSettings = timeoutSettings;
            return this;
        }

        public Builder timeoutSettings(BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettingsArgs timeoutSettings) {
            return timeoutSettings(Output.of(timeoutSettings));
        }

        public Builder visuallyCompleteOptions(@Nullable Output<BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptionsArgs> visuallyCompleteOptions) {
            $.visuallyCompleteOptions = visuallyCompleteOptions;
            return this;
        }

        public Builder visuallyCompleteOptions(BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptionsArgs visuallyCompleteOptions) {
            return visuallyCompleteOptions(Output.of(visuallyCompleteOptions));
        }

        public BrowserMonitorScriptConfigurationJavascriptSetttingsArgs build() {
            return $;
        }
    }

}
