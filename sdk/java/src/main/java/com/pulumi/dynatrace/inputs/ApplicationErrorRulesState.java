// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ApplicationErrorRulesCustomErrorsArgs;
import com.pulumi.dynatrace.inputs.ApplicationErrorRulesHttpErrorsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationErrorRulesState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationErrorRulesState Empty = new ApplicationErrorRulesState();

    /**
     * (Field has overlap with `dynatrace.WebAppCustomErrors`) An ordered list of HTTP errors.
     * 
     */
    @Import(name="customErrors")
    private @Nullable Output<ApplicationErrorRulesCustomErrorsArgs> customErrors;

    /**
     * @return (Field has overlap with `dynatrace.WebAppCustomErrors`) An ordered list of HTTP errors.
     * 
     */
    public Optional<Output<ApplicationErrorRulesCustomErrorsArgs>> customErrors() {
        return Optional.ofNullable(this.customErrors);
    }

    /**
     * (Field has overlap with `dynatrace_web_app_request_errors`) An ordered list of HTTP errors. Rules are evaluated from top
     * to bottom; the first matching rule applies
     * 
     */
    @Import(name="httpErrors")
    private @Nullable Output<ApplicationErrorRulesHttpErrorsArgs> httpErrors;

    /**
     * @return (Field has overlap with `dynatrace_web_app_request_errors`) An ordered list of HTTP errors. Rules are evaluated from top
     * to bottom; the first matching rule applies
     * 
     */
    public Optional<Output<ApplicationErrorRulesHttpErrorsArgs>> httpErrors() {
        return Optional.ofNullable(this.httpErrors);
    }

    /**
     * (Field has overlap with `dynatrace_web_app_custom_errors`) Exclude (`true`) or include (`false`) custom errors listed in
     * **customErrorRules** in Apdex calculation
     * 
     */
    @Import(name="ignoreCustomErrorsApdex")
    private @Nullable Output<Boolean> ignoreCustomErrorsApdex;

    /**
     * @return (Field has overlap with `dynatrace_web_app_custom_errors`) Exclude (`true`) or include (`false`) custom errors listed in
     * **customErrorRules** in Apdex calculation
     * 
     */
    public Optional<Output<Boolean>> ignoreCustomErrorsApdex() {
        return Optional.ofNullable(this.ignoreCustomErrorsApdex);
    }

    /**
     * (Field has overlap with `dynatrace_web_app_request_errors`) Exclude (`true`) or include (`false`) HTTP errors listed in
     * **httpErrorRules** in Apdex calculation
     * 
     */
    @Import(name="ignoreHttpErrorsApdex")
    private @Nullable Output<Boolean> ignoreHttpErrorsApdex;

    /**
     * @return (Field has overlap with `dynatrace_web_app_request_errors`) Exclude (`true`) or include (`false`) HTTP errors listed in
     * **httpErrorRules** in Apdex calculation
     * 
     */
    public Optional<Output<Boolean>> ignoreHttpErrorsApdex() {
        return Optional.ofNullable(this.ignoreHttpErrorsApdex);
    }

    /**
     * Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
     * 
     */
    @Import(name="ignoreJsErrorsApdex")
    private @Nullable Output<Boolean> ignoreJsErrorsApdex;

    /**
     * @return Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
     * 
     */
    public Optional<Output<Boolean>> ignoreJsErrorsApdex() {
        return Optional.ofNullable(this.ignoreJsErrorsApdex);
    }

    /**
     * The EntityID of the the WebApplication
     * 
     */
    @Import(name="webApplicationId")
    private @Nullable Output<String> webApplicationId;

    /**
     * @return The EntityID of the the WebApplication
     * 
     */
    public Optional<Output<String>> webApplicationId() {
        return Optional.ofNullable(this.webApplicationId);
    }

    private ApplicationErrorRulesState() {}

    private ApplicationErrorRulesState(ApplicationErrorRulesState $) {
        this.customErrors = $.customErrors;
        this.httpErrors = $.httpErrors;
        this.ignoreCustomErrorsApdex = $.ignoreCustomErrorsApdex;
        this.ignoreHttpErrorsApdex = $.ignoreHttpErrorsApdex;
        this.ignoreJsErrorsApdex = $.ignoreJsErrorsApdex;
        this.webApplicationId = $.webApplicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationErrorRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationErrorRulesState $;

        public Builder() {
            $ = new ApplicationErrorRulesState();
        }

        public Builder(ApplicationErrorRulesState defaults) {
            $ = new ApplicationErrorRulesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customErrors (Field has overlap with `dynatrace.WebAppCustomErrors`) An ordered list of HTTP errors.
         * 
         * @return builder
         * 
         */
        public Builder customErrors(@Nullable Output<ApplicationErrorRulesCustomErrorsArgs> customErrors) {
            $.customErrors = customErrors;
            return this;
        }

        /**
         * @param customErrors (Field has overlap with `dynatrace.WebAppCustomErrors`) An ordered list of HTTP errors.
         * 
         * @return builder
         * 
         */
        public Builder customErrors(ApplicationErrorRulesCustomErrorsArgs customErrors) {
            return customErrors(Output.of(customErrors));
        }

        /**
         * @param httpErrors (Field has overlap with `dynatrace_web_app_request_errors`) An ordered list of HTTP errors. Rules are evaluated from top
         * to bottom; the first matching rule applies
         * 
         * @return builder
         * 
         */
        public Builder httpErrors(@Nullable Output<ApplicationErrorRulesHttpErrorsArgs> httpErrors) {
            $.httpErrors = httpErrors;
            return this;
        }

        /**
         * @param httpErrors (Field has overlap with `dynatrace_web_app_request_errors`) An ordered list of HTTP errors. Rules are evaluated from top
         * to bottom; the first matching rule applies
         * 
         * @return builder
         * 
         */
        public Builder httpErrors(ApplicationErrorRulesHttpErrorsArgs httpErrors) {
            return httpErrors(Output.of(httpErrors));
        }

        /**
         * @param ignoreCustomErrorsApdex (Field has overlap with `dynatrace_web_app_custom_errors`) Exclude (`true`) or include (`false`) custom errors listed in
         * **customErrorRules** in Apdex calculation
         * 
         * @return builder
         * 
         */
        public Builder ignoreCustomErrorsApdex(@Nullable Output<Boolean> ignoreCustomErrorsApdex) {
            $.ignoreCustomErrorsApdex = ignoreCustomErrorsApdex;
            return this;
        }

        /**
         * @param ignoreCustomErrorsApdex (Field has overlap with `dynatrace_web_app_custom_errors`) Exclude (`true`) or include (`false`) custom errors listed in
         * **customErrorRules** in Apdex calculation
         * 
         * @return builder
         * 
         */
        public Builder ignoreCustomErrorsApdex(Boolean ignoreCustomErrorsApdex) {
            return ignoreCustomErrorsApdex(Output.of(ignoreCustomErrorsApdex));
        }

        /**
         * @param ignoreHttpErrorsApdex (Field has overlap with `dynatrace_web_app_request_errors`) Exclude (`true`) or include (`false`) HTTP errors listed in
         * **httpErrorRules** in Apdex calculation
         * 
         * @return builder
         * 
         */
        public Builder ignoreHttpErrorsApdex(@Nullable Output<Boolean> ignoreHttpErrorsApdex) {
            $.ignoreHttpErrorsApdex = ignoreHttpErrorsApdex;
            return this;
        }

        /**
         * @param ignoreHttpErrorsApdex (Field has overlap with `dynatrace_web_app_request_errors`) Exclude (`true`) or include (`false`) HTTP errors listed in
         * **httpErrorRules** in Apdex calculation
         * 
         * @return builder
         * 
         */
        public Builder ignoreHttpErrorsApdex(Boolean ignoreHttpErrorsApdex) {
            return ignoreHttpErrorsApdex(Output.of(ignoreHttpErrorsApdex));
        }

        /**
         * @param ignoreJsErrorsApdex Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
         * 
         * @return builder
         * 
         */
        public Builder ignoreJsErrorsApdex(@Nullable Output<Boolean> ignoreJsErrorsApdex) {
            $.ignoreJsErrorsApdex = ignoreJsErrorsApdex;
            return this;
        }

        /**
         * @param ignoreJsErrorsApdex Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
         * 
         * @return builder
         * 
         */
        public Builder ignoreJsErrorsApdex(Boolean ignoreJsErrorsApdex) {
            return ignoreJsErrorsApdex(Output.of(ignoreJsErrorsApdex));
        }

        /**
         * @param webApplicationId The EntityID of the the WebApplication
         * 
         * @return builder
         * 
         */
        public Builder webApplicationId(@Nullable Output<String> webApplicationId) {
            $.webApplicationId = webApplicationId;
            return this;
        }

        /**
         * @param webApplicationId The EntityID of the the WebApplication
         * 
         * @return builder
         * 
         */
        public Builder webApplicationId(String webApplicationId) {
            return webApplicationId(Output.of(webApplicationId));
        }

        public ApplicationErrorRulesState build() {
            return $;
        }
    }

}
