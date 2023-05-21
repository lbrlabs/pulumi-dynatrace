// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationDetectionRuleV2State extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDetectionRuleV2State Empty = new ApplicationDetectionRuleV2State();

    /**
     * Select an existing application or create a new one.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return Select an existing application or create a new one.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Possible Values: `DOMAIN_CONTAINS`, `DOMAIN_ENDS_WITH`, `DOMAIN_EQUALS`, `DOMAIN_MATCHES`, `DOMAIN_STARTS_WITH`, `URL_CONTAINS`, `URL_ENDS_WITH`, `URL_EQUALS`, `URL_STARTS_WITH`
     * 
     */
    @Import(name="matcher")
    private @Nullable Output<String> matcher;

    /**
     * @return Possible Values: `DOMAIN_CONTAINS`, `DOMAIN_ENDS_WITH`, `DOMAIN_EQUALS`, `DOMAIN_MATCHES`, `DOMAIN_STARTS_WITH`, `URL_CONTAINS`, `URL_ENDS_WITH`, `URL_EQUALS`, `URL_STARTS_WITH`
     * 
     */
    public Optional<Output<String>> matcher() {
        return Optional.ofNullable(this.matcher);
    }

    /**
     * Pattern
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return Pattern
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private ApplicationDetectionRuleV2State() {}

    private ApplicationDetectionRuleV2State(ApplicationDetectionRuleV2State $) {
        this.applicationId = $.applicationId;
        this.matcher = $.matcher;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDetectionRuleV2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDetectionRuleV2State $;

        public Builder() {
            $ = new ApplicationDetectionRuleV2State();
        }

        public Builder(ApplicationDetectionRuleV2State defaults) {
            $ = new ApplicationDetectionRuleV2State(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Select an existing application or create a new one.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Select an existing application or create a new one.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param matcher Possible Values: `DOMAIN_CONTAINS`, `DOMAIN_ENDS_WITH`, `DOMAIN_EQUALS`, `DOMAIN_MATCHES`, `DOMAIN_STARTS_WITH`, `URL_CONTAINS`, `URL_ENDS_WITH`, `URL_EQUALS`, `URL_STARTS_WITH`
         * 
         * @return builder
         * 
         */
        public Builder matcher(@Nullable Output<String> matcher) {
            $.matcher = matcher;
            return this;
        }

        /**
         * @param matcher Possible Values: `DOMAIN_CONTAINS`, `DOMAIN_ENDS_WITH`, `DOMAIN_EQUALS`, `DOMAIN_MATCHES`, `DOMAIN_STARTS_WITH`, `URL_CONTAINS`, `URL_ENDS_WITH`, `URL_EQUALS`, `URL_STARTS_WITH`
         * 
         * @return builder
         * 
         */
        public Builder matcher(String matcher) {
            return matcher(Output.of(matcher));
        }

        /**
         * @param pattern Pattern
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Pattern
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public ApplicationDetectionRuleV2State build() {
            return $;
        }
    }

}