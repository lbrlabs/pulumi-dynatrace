// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceNamingConditionConditionIndexedTagValueArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNamingConditionConditionIndexedTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNamingConditionConditionIndexedTagArgs Empty = new ServiceNamingConditionConditionIndexedTagArgs();

    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    @Import(name="value")
    private @Nullable Output<ServiceNamingConditionConditionIndexedTagValueArgs> value;

    public Optional<Output<ServiceNamingConditionConditionIndexedTagValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceNamingConditionConditionIndexedTagArgs() {}

    private ServiceNamingConditionConditionIndexedTagArgs(ServiceNamingConditionConditionIndexedTagArgs $) {
        this.negate = $.negate;
        this.operator = $.operator;
        this.unknowns = $.unknowns;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNamingConditionConditionIndexedTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNamingConditionConditionIndexedTagArgs $;

        public Builder() {
            $ = new ServiceNamingConditionConditionIndexedTagArgs();
        }

        public Builder(ServiceNamingConditionConditionIndexedTagArgs defaults) {
            $ = new ServiceNamingConditionConditionIndexedTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public Builder value(@Nullable Output<ServiceNamingConditionConditionIndexedTagValueArgs> value) {
            $.value = value;
            return this;
        }

        public Builder value(ServiceNamingConditionConditionIndexedTagValueArgs value) {
            return value(Output.of(value));
        }

        public ServiceNamingConditionConditionIndexedTagArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
