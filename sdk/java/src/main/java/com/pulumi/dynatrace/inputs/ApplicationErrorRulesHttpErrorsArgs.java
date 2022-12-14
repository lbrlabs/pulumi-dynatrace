// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ApplicationErrorRulesHttpErrorsRuleArgs;
import java.util.List;
import java.util.Objects;


public final class ApplicationErrorRulesHttpErrorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationErrorRulesHttpErrorsArgs Empty = new ApplicationErrorRulesHttpErrorsArgs();

    /**
     * Configuration of the HTTP error in the web application
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<ApplicationErrorRulesHttpErrorsRuleArgs>> rules;

    /**
     * @return Configuration of the HTTP error in the web application
     * 
     */
    public Output<List<ApplicationErrorRulesHttpErrorsRuleArgs>> rules() {
        return this.rules;
    }

    private ApplicationErrorRulesHttpErrorsArgs() {}

    private ApplicationErrorRulesHttpErrorsArgs(ApplicationErrorRulesHttpErrorsArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationErrorRulesHttpErrorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationErrorRulesHttpErrorsArgs $;

        public Builder() {
            $ = new ApplicationErrorRulesHttpErrorsArgs();
        }

        public Builder(ApplicationErrorRulesHttpErrorsArgs defaults) {
            $ = new ApplicationErrorRulesHttpErrorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rules Configuration of the HTTP error in the web application
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<ApplicationErrorRulesHttpErrorsRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Configuration of the HTTP error in the web application
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ApplicationErrorRulesHttpErrorsRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Configuration of the HTTP error in the web application
         * 
         * @return builder
         * 
         */
        public Builder rules(ApplicationErrorRulesHttpErrorsRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ApplicationErrorRulesHttpErrorsArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
