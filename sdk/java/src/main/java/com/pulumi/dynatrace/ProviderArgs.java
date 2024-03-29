// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="dtApiToken")
    private @Nullable Output<String> dtApiToken;

    public Optional<Output<String>> dtApiToken() {
        return Optional.ofNullable(this.dtApiToken);
    }

    @Import(name="dtClusterApiToken")
    private @Nullable Output<String> dtClusterApiToken;

    public Optional<Output<String>> dtClusterApiToken() {
        return Optional.ofNullable(this.dtClusterApiToken);
    }

    @Import(name="dtClusterUrl")
    private @Nullable Output<String> dtClusterUrl;

    public Optional<Output<String>> dtClusterUrl() {
        return Optional.ofNullable(this.dtClusterUrl);
    }

    @Import(name="dtEnvUrl")
    private @Nullable Output<String> dtEnvUrl;

    public Optional<Output<String>> dtEnvUrl() {
        return Optional.ofNullable(this.dtEnvUrl);
    }

    @Import(name="iamAccountId")
    private @Nullable Output<String> iamAccountId;

    public Optional<Output<String>> iamAccountId() {
        return Optional.ofNullable(this.iamAccountId);
    }

    @Import(name="iamClientId")
    private @Nullable Output<String> iamClientId;

    public Optional<Output<String>> iamClientId() {
        return Optional.ofNullable(this.iamClientId);
    }

    @Import(name="iamClientSecret")
    private @Nullable Output<String> iamClientSecret;

    public Optional<Output<String>> iamClientSecret() {
        return Optional.ofNullable(this.iamClientSecret);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.dtApiToken = $.dtApiToken;
        this.dtClusterApiToken = $.dtClusterApiToken;
        this.dtClusterUrl = $.dtClusterUrl;
        this.dtEnvUrl = $.dtEnvUrl;
        this.iamAccountId = $.iamAccountId;
        this.iamClientId = $.iamClientId;
        this.iamClientSecret = $.iamClientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder dtApiToken(@Nullable Output<String> dtApiToken) {
            $.dtApiToken = dtApiToken;
            return this;
        }

        public Builder dtApiToken(String dtApiToken) {
            return dtApiToken(Output.of(dtApiToken));
        }

        public Builder dtClusterApiToken(@Nullable Output<String> dtClusterApiToken) {
            $.dtClusterApiToken = dtClusterApiToken;
            return this;
        }

        public Builder dtClusterApiToken(String dtClusterApiToken) {
            return dtClusterApiToken(Output.of(dtClusterApiToken));
        }

        public Builder dtClusterUrl(@Nullable Output<String> dtClusterUrl) {
            $.dtClusterUrl = dtClusterUrl;
            return this;
        }

        public Builder dtClusterUrl(String dtClusterUrl) {
            return dtClusterUrl(Output.of(dtClusterUrl));
        }

        public Builder dtEnvUrl(@Nullable Output<String> dtEnvUrl) {
            $.dtEnvUrl = dtEnvUrl;
            return this;
        }

        public Builder dtEnvUrl(String dtEnvUrl) {
            return dtEnvUrl(Output.of(dtEnvUrl));
        }

        public Builder iamAccountId(@Nullable Output<String> iamAccountId) {
            $.iamAccountId = iamAccountId;
            return this;
        }

        public Builder iamAccountId(String iamAccountId) {
            return iamAccountId(Output.of(iamAccountId));
        }

        public Builder iamClientId(@Nullable Output<String> iamClientId) {
            $.iamClientId = iamClientId;
            return this;
        }

        public Builder iamClientId(String iamClientId) {
            return iamClientId(Output.of(iamClientId));
        }

        public Builder iamClientSecret(@Nullable Output<String> iamClientSecret) {
            $.iamClientSecret = iamClientSecret;
            return this;
        }

        public Builder iamClientSecret(String iamClientSecret) {
            return iamClientSecret(Output.of(iamClientSecret));
        }

        public ProviderArgs build() {
            $.dtApiToken = Codegen.stringProp("dtApiToken").secret().arg($.dtApiToken).env("DYNATRACE_API_TOKEN", "DT_API_TOKEN").getNullable();
            $.dtClusterApiToken = Codegen.stringProp("dtClusterApiToken").secret().arg($.dtClusterApiToken).env("DYNATRACE_CLUSTER_API_TOKEN", "DT_CLUSTER_API_TOKEN").getNullable();
            $.dtClusterUrl = Codegen.stringProp("dtClusterUrl").secret().arg($.dtClusterUrl).env("DYNATRACE_CLUSTER_URL", "DT_CLUSTER_URL").getNullable();
            $.dtEnvUrl = Codegen.stringProp("dtEnvUrl").output().arg($.dtEnvUrl).env("DYNATRACE_ENV_URL", "DT_ENV_URL").getNullable();
            return $;
        }
    }

}
