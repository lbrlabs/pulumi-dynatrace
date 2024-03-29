// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetworkTrafficExcludeNicNicFormArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkTrafficExcludeNicNicFormArgs Empty = new NetworkTrafficExcludeNicNicFormArgs();

    @Import(name="interface", required=true)
    private Output<String> interface_;

    public Output<String> interface_() {
        return this.interface_;
    }

    @Import(name="os", required=true)
    private Output<String> os;

    public Output<String> os() {
        return this.os;
    }

    private NetworkTrafficExcludeNicNicFormArgs() {}

    private NetworkTrafficExcludeNicNicFormArgs(NetworkTrafficExcludeNicNicFormArgs $) {
        this.interface_ = $.interface_;
        this.os = $.os;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkTrafficExcludeNicNicFormArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkTrafficExcludeNicNicFormArgs $;

        public Builder() {
            $ = new NetworkTrafficExcludeNicNicFormArgs();
        }

        public Builder(NetworkTrafficExcludeNicNicFormArgs defaults) {
            $ = new NetworkTrafficExcludeNicNicFormArgs(Objects.requireNonNull(defaults));
        }

        public Builder interface_(Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        public Builder os(Output<String> os) {
            $.os = os;
            return this;
        }

        public Builder os(String os) {
            return os(Output.of(os));
        }

        public NetworkTrafficExcludeNicNicFormArgs build() {
            $.interface_ = Objects.requireNonNull($.interface_, "expected parameter 'interface' to be non-null");
            $.os = Objects.requireNonNull($.os, "expected parameter 'os' to be non-null");
            return $;
        }
    }

}
