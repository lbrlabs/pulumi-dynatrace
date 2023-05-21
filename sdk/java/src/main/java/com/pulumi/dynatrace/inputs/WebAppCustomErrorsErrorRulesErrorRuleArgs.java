// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppCustomErrorsErrorRulesErrorRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppCustomErrorsErrorRulesErrorRuleArgs Empty = new WebAppCustomErrorsErrorRulesErrorRuleArgs();

    @Import(name="captureSettings", required=true)
    private Output<WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs> captureSettings;

    public Output<WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs> captureSettings() {
        return this.captureSettings;
    }

    @Import(name="keyMatcher", required=true)
    private Output<String> keyMatcher;

    public Output<String> keyMatcher() {
        return this.keyMatcher;
    }

    @Import(name="keyPattern")
    private @Nullable Output<String> keyPattern;

    public Optional<Output<String>> keyPattern() {
        return Optional.ofNullable(this.keyPattern);
    }

    @Import(name="valueMatcher", required=true)
    private Output<String> valueMatcher;

    public Output<String> valueMatcher() {
        return this.valueMatcher;
    }

    @Import(name="valuePattern")
    private @Nullable Output<String> valuePattern;

    public Optional<Output<String>> valuePattern() {
        return Optional.ofNullable(this.valuePattern);
    }

    private WebAppCustomErrorsErrorRulesErrorRuleArgs() {}

    private WebAppCustomErrorsErrorRulesErrorRuleArgs(WebAppCustomErrorsErrorRulesErrorRuleArgs $) {
        this.captureSettings = $.captureSettings;
        this.keyMatcher = $.keyMatcher;
        this.keyPattern = $.keyPattern;
        this.valueMatcher = $.valueMatcher;
        this.valuePattern = $.valuePattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppCustomErrorsErrorRulesErrorRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppCustomErrorsErrorRulesErrorRuleArgs $;

        public Builder() {
            $ = new WebAppCustomErrorsErrorRulesErrorRuleArgs();
        }

        public Builder(WebAppCustomErrorsErrorRulesErrorRuleArgs defaults) {
            $ = new WebAppCustomErrorsErrorRulesErrorRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder captureSettings(Output<WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs> captureSettings) {
            $.captureSettings = captureSettings;
            return this;
        }

        public Builder captureSettings(WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs captureSettings) {
            return captureSettings(Output.of(captureSettings));
        }

        public Builder keyMatcher(Output<String> keyMatcher) {
            $.keyMatcher = keyMatcher;
            return this;
        }

        public Builder keyMatcher(String keyMatcher) {
            return keyMatcher(Output.of(keyMatcher));
        }

        public Builder keyPattern(@Nullable Output<String> keyPattern) {
            $.keyPattern = keyPattern;
            return this;
        }

        public Builder keyPattern(String keyPattern) {
            return keyPattern(Output.of(keyPattern));
        }

        public Builder valueMatcher(Output<String> valueMatcher) {
            $.valueMatcher = valueMatcher;
            return this;
        }

        public Builder valueMatcher(String valueMatcher) {
            return valueMatcher(Output.of(valueMatcher));
        }

        public Builder valuePattern(@Nullable Output<String> valuePattern) {
            $.valuePattern = valuePattern;
            return this;
        }

        public Builder valuePattern(String valuePattern) {
            return valuePattern(Output.of(valuePattern));
        }

        public WebAppCustomErrorsErrorRulesErrorRuleArgs build() {
            $.captureSettings = Objects.requireNonNull($.captureSettings, "expected parameter 'captureSettings' to be non-null");
            $.keyMatcher = Objects.requireNonNull($.keyMatcher, "expected parameter 'keyMatcher' to be non-null");
            $.valueMatcher = Objects.requireNonNull($.valueMatcher, "expected parameter 'valueMatcher' to be non-null");
            return $;
        }
    }

}