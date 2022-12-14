// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptConfigurationHeadersHeaderArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptConfigurationHeadersArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptConfigurationHeadersArgs Empty = new BrowserMonitorScriptConfigurationHeadersArgs();

    @Import(name="headers", required=true)
    private Output<List<BrowserMonitorScriptConfigurationHeadersHeaderArgs>> headers;

    public Output<List<BrowserMonitorScriptConfigurationHeadersHeaderArgs>> headers() {
        return this.headers;
    }

    @Import(name="restrictions")
    private @Nullable Output<List<String>> restrictions;

    public Optional<Output<List<String>>> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }

    private BrowserMonitorScriptConfigurationHeadersArgs() {}

    private BrowserMonitorScriptConfigurationHeadersArgs(BrowserMonitorScriptConfigurationHeadersArgs $) {
        this.headers = $.headers;
        this.restrictions = $.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptConfigurationHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptConfigurationHeadersArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptConfigurationHeadersArgs();
        }

        public Builder(BrowserMonitorScriptConfigurationHeadersArgs defaults) {
            $ = new BrowserMonitorScriptConfigurationHeadersArgs(Objects.requireNonNull(defaults));
        }

        public Builder headers(Output<List<BrowserMonitorScriptConfigurationHeadersHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<BrowserMonitorScriptConfigurationHeadersHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(BrowserMonitorScriptConfigurationHeadersHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        public Builder restrictions(@Nullable Output<List<String>> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        public Builder restrictions(List<String> restrictions) {
            return restrictions(Output.of(restrictions));
        }

        public Builder restrictions(String... restrictions) {
            return restrictions(List.of(restrictions));
        }

        public BrowserMonitorScriptConfigurationHeadersArgs build() {
            $.headers = Objects.requireNonNull($.headers, "expected parameter 'headers' to be non-null");
            return $;
        }
    }

}
