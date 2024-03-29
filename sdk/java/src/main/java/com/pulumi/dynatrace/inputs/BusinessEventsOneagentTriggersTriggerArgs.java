// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BusinessEventsOneagentTriggersTriggerSourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BusinessEventsOneagentTriggersTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final BusinessEventsOneagentTriggersTriggerArgs Empty = new BusinessEventsOneagentTriggersTriggerArgs();

    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="source", required=true)
    private Output<BusinessEventsOneagentTriggersTriggerSourceArgs> source;

    public Output<BusinessEventsOneagentTriggersTriggerSourceArgs> source() {
        return this.source;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private BusinessEventsOneagentTriggersTriggerArgs() {}

    private BusinessEventsOneagentTriggersTriggerArgs(BusinessEventsOneagentTriggersTriggerArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.source = $.source;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessEventsOneagentTriggersTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessEventsOneagentTriggersTriggerArgs $;

        public Builder() {
            $ = new BusinessEventsOneagentTriggersTriggerArgs();
        }

        public Builder(BusinessEventsOneagentTriggersTriggerArgs defaults) {
            $ = new BusinessEventsOneagentTriggersTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public Builder source(Output<BusinessEventsOneagentTriggersTriggerSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(BusinessEventsOneagentTriggersTriggerSourceArgs source) {
            return source(Output.of(source));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public BusinessEventsOneagentTriggersTriggerArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
