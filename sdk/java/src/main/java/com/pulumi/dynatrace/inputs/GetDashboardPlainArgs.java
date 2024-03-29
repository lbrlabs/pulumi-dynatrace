// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDashboardPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDashboardPlainArgs Empty = new GetDashboardPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="owner", required=true)
    private String owner;

    public String owner() {
        return this.owner;
    }

    private GetDashboardPlainArgs() {}

    private GetDashboardPlainArgs(GetDashboardPlainArgs $) {
        this.name = $.name;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDashboardPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDashboardPlainArgs $;

        public Builder() {
            $ = new GetDashboardPlainArgs();
        }

        public Builder(GetDashboardPlainArgs defaults) {
            $ = new GetDashboardPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder owner(String owner) {
            $.owner = owner;
            return this;
        }

        public GetDashboardPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            return $;
        }
    }

}
