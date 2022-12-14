// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs Empty = new RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs();

    @Import(name="managementZone")
    private @Nullable Output<String> managementZone;

    public Optional<Output<String>> managementZone() {
        return Optional.ofNullable(this.managementZone);
    }

    @Import(name="serviceTag")
    private @Nullable Output<RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagArgs> serviceTag;

    public Optional<Output<RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagArgs>> serviceTag() {
        return Optional.ofNullable(this.serviceTag);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs() {}

    private RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs(RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs $) {
        this.managementZone = $.managementZone;
        this.serviceTag = $.serviceTag;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs $;

        public Builder() {
            $ = new RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs();
        }

        public Builder(RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs defaults) {
            $ = new RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder managementZone(@Nullable Output<String> managementZone) {
            $.managementZone = managementZone;
            return this;
        }

        public Builder managementZone(String managementZone) {
            return managementZone(Output.of(managementZone));
        }

        public Builder serviceTag(@Nullable Output<RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagArgs> serviceTag) {
            $.serviceTag = serviceTag;
            return this;
        }

        public Builder serviceTag(RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagArgs serviceTag) {
            return serviceTag(Output.of(serviceTag));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceArgs build() {
            return $;
        }
    }

}
