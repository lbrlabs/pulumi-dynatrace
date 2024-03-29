// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebAppCustomErrorsErrorRulesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppCustomErrorsState extends com.pulumi.resources.ResourceArgs {

    public static final WebAppCustomErrorsState Empty = new WebAppCustomErrorsState();

    /**
     * (Field has overlap with `dynatrace.ApplicationErrorRules`)
     * 
     */
    @Import(name="errorRules")
    private @Nullable Output<WebAppCustomErrorsErrorRulesArgs> errorRules;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationErrorRules`)
     * 
     */
    public Optional<Output<WebAppCustomErrorsErrorRulesArgs>> errorRules() {
        return Optional.ofNullable(this.errorRules);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationErrorRules`) This setting overrides Apdex settings for individual rules listed below
     * 
     */
    @Import(name="ignoreCustomErrorsInApdexCalculation")
    private @Nullable Output<Boolean> ignoreCustomErrorsInApdexCalculation;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationErrorRules`) This setting overrides Apdex settings for individual rules listed below
     * 
     */
    public Optional<Output<Boolean>> ignoreCustomErrorsInApdexCalculation() {
        return Optional.ofNullable(this.ignoreCustomErrorsInApdexCalculation);
    }

    /**
     * The scope of this setting (APPLICATION)
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (APPLICATION)
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private WebAppCustomErrorsState() {}

    private WebAppCustomErrorsState(WebAppCustomErrorsState $) {
        this.errorRules = $.errorRules;
        this.ignoreCustomErrorsInApdexCalculation = $.ignoreCustomErrorsInApdexCalculation;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppCustomErrorsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppCustomErrorsState $;

        public Builder() {
            $ = new WebAppCustomErrorsState();
        }

        public Builder(WebAppCustomErrorsState defaults) {
            $ = new WebAppCustomErrorsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorRules (Field has overlap with `dynatrace.ApplicationErrorRules`)
         * 
         * @return builder
         * 
         */
        public Builder errorRules(@Nullable Output<WebAppCustomErrorsErrorRulesArgs> errorRules) {
            $.errorRules = errorRules;
            return this;
        }

        /**
         * @param errorRules (Field has overlap with `dynatrace.ApplicationErrorRules`)
         * 
         * @return builder
         * 
         */
        public Builder errorRules(WebAppCustomErrorsErrorRulesArgs errorRules) {
            return errorRules(Output.of(errorRules));
        }

        /**
         * @param ignoreCustomErrorsInApdexCalculation (Field has overlap with `dynatrace.ApplicationErrorRules`) This setting overrides Apdex settings for individual rules listed below
         * 
         * @return builder
         * 
         */
        public Builder ignoreCustomErrorsInApdexCalculation(@Nullable Output<Boolean> ignoreCustomErrorsInApdexCalculation) {
            $.ignoreCustomErrorsInApdexCalculation = ignoreCustomErrorsInApdexCalculation;
            return this;
        }

        /**
         * @param ignoreCustomErrorsInApdexCalculation (Field has overlap with `dynatrace.ApplicationErrorRules`) This setting overrides Apdex settings for individual rules listed below
         * 
         * @return builder
         * 
         */
        public Builder ignoreCustomErrorsInApdexCalculation(Boolean ignoreCustomErrorsInApdexCalculation) {
            return ignoreCustomErrorsInApdexCalculation(Output.of(ignoreCustomErrorsInApdexCalculation));
        }

        /**
         * @param scope The scope of this setting (APPLICATION)
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (APPLICATION)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public WebAppCustomErrorsState build() {
            return $;
        }
    }

}
