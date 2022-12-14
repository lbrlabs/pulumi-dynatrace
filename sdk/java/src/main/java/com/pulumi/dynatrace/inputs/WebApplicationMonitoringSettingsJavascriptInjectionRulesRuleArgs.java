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


public final class WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs Empty = new WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="htmlPattern")
    private @Nullable Output<String> htmlPattern;

    public Optional<Output<String>> htmlPattern() {
        return Optional.ofNullable(this.htmlPattern);
    }

    @Import(name="rule", required=true)
    private Output<String> rule;

    public Output<String> rule() {
        return this.rule;
    }

    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="urlOperator", required=true)
    private Output<String> urlOperator;

    public Output<String> urlOperator() {
        return this.urlOperator;
    }

    @Import(name="urlPattern")
    private @Nullable Output<String> urlPattern;

    public Optional<Output<String>> urlPattern() {
        return Optional.ofNullable(this.urlPattern);
    }

    private WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs() {}

    private WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs(WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs $) {
        this.enabled = $.enabled;
        this.htmlPattern = $.htmlPattern;
        this.rule = $.rule;
        this.target = $.target;
        this.urlOperator = $.urlOperator;
        this.urlPattern = $.urlPattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs $;

        public Builder() {
            $ = new WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs();
        }

        public Builder(WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs defaults) {
            $ = new WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder htmlPattern(@Nullable Output<String> htmlPattern) {
            $.htmlPattern = htmlPattern;
            return this;
        }

        public Builder htmlPattern(String htmlPattern) {
            return htmlPattern(Output.of(htmlPattern));
        }

        public Builder rule(Output<String> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder urlOperator(Output<String> urlOperator) {
            $.urlOperator = urlOperator;
            return this;
        }

        public Builder urlOperator(String urlOperator) {
            return urlOperator(Output.of(urlOperator));
        }

        public Builder urlPattern(@Nullable Output<String> urlPattern) {
            $.urlPattern = urlPattern;
            return this;
        }

        public Builder urlPattern(String urlPattern) {
            return urlPattern(Output.of(urlPattern));
        }

        public WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs build() {
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            $.urlOperator = Objects.requireNonNull($.urlOperator, "expected parameter 'urlOperator' to be non-null");
            return $;
        }
    }

}
