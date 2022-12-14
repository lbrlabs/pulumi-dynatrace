// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesRuleArgs;
import java.util.List;
import java.util.Objects;


public final class ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs Empty = new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs();

    @Import(name="rules", required=true)
    private Output<List<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesRuleArgs>> rules;

    public Output<List<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesRuleArgs>> rules() {
        return this.rules;
    }

    private ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs() {}

    private ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs $;

        public Builder() {
            $ = new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs();
        }

        public Builder(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs defaults) {
            $ = new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(Output<List<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingRulesArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
