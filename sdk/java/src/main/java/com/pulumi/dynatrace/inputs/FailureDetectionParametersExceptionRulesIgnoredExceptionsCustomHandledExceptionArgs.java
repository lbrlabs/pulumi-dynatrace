// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs Empty = new FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs();

    @Import(name="classPattern")
    private @Nullable Output<String> classPattern;

    public Optional<Output<String>> classPattern() {
        return Optional.ofNullable(this.classPattern);
    }

    @Import(name="messagePattern")
    private @Nullable Output<String> messagePattern;

    public Optional<Output<String>> messagePattern() {
        return Optional.ofNullable(this.messagePattern);
    }

    private FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs() {}

    private FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs(FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs $) {
        this.classPattern = $.classPattern;
        this.messagePattern = $.messagePattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs $;

        public Builder() {
            $ = new FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs();
        }

        public Builder(FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs defaults) {
            $ = new FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder classPattern(@Nullable Output<String> classPattern) {
            $.classPattern = classPattern;
            return this;
        }

        public Builder classPattern(String classPattern) {
            return classPattern(Output.of(classPattern));
        }

        public Builder messagePattern(@Nullable Output<String> messagePattern) {
            $.messagePattern = messagePattern;
            return this;
        }

        public Builder messagePattern(String messagePattern) {
            return messagePattern(Output.of(messagePattern));
        }

        public FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs build() {
            return $;
        }
    }

}