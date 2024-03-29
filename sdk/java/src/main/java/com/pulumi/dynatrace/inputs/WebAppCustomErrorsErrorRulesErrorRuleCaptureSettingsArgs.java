// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs Empty = new WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs();

    @Import(name="capture", required=true)
    private Output<Boolean> capture;

    public Output<Boolean> capture() {
        return this.capture;
    }

    @Import(name="considerForAi")
    private @Nullable Output<Boolean> considerForAi;

    public Optional<Output<Boolean>> considerForAi() {
        return Optional.ofNullable(this.considerForAi);
    }

    @Import(name="impactApdex")
    private @Nullable Output<Boolean> impactApdex;

    public Optional<Output<Boolean>> impactApdex() {
        return Optional.ofNullable(this.impactApdex);
    }

    private WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs() {}

    private WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs(WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs $) {
        this.capture = $.capture;
        this.considerForAi = $.considerForAi;
        this.impactApdex = $.impactApdex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs $;

        public Builder() {
            $ = new WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs();
        }

        public Builder(WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs defaults) {
            $ = new WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder capture(Output<Boolean> capture) {
            $.capture = capture;
            return this;
        }

        public Builder capture(Boolean capture) {
            return capture(Output.of(capture));
        }

        public Builder considerForAi(@Nullable Output<Boolean> considerForAi) {
            $.considerForAi = considerForAi;
            return this;
        }

        public Builder considerForAi(Boolean considerForAi) {
            return considerForAi(Output.of(considerForAi));
        }

        public Builder impactApdex(@Nullable Output<Boolean> impactApdex) {
            $.impactApdex = impactApdex;
            return this;
        }

        public Builder impactApdex(Boolean impactApdex) {
            return impactApdex(Output.of(impactApdex));
        }

        public WebAppCustomErrorsErrorRulesErrorRuleCaptureSettingsArgs build() {
            $.capture = Objects.requireNonNull($.capture, "expected parameter 'capture' to be non-null");
            return $;
        }
    }

}
