// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RemoteEnvironmentsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RemoteEnvironmentsArgs Empty = new RemoteEnvironmentsArgs();

    /**
     * Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
     * 
     */
    @Import(name="networkScope", required=true)
    private Output<String> networkScope;

    /**
     * @return Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
     * 
     */
    public Output<String> networkScope() {
        return this.networkScope;
    }

    /**
     * Provide a valid token created on the remote environment.
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return Provide a valid token created on the remote environment.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    /**
     * Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private RemoteEnvironmentsArgs() {}

    private RemoteEnvironmentsArgs(RemoteEnvironmentsArgs $) {
        this.name = $.name;
        this.networkScope = $.networkScope;
        this.token = $.token;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteEnvironmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteEnvironmentsArgs $;

        public Builder() {
            $ = new RemoteEnvironmentsArgs();
        }

        public Builder(RemoteEnvironmentsArgs defaults) {
            $ = new RemoteEnvironmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkScope Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
         * 
         * @return builder
         * 
         */
        public Builder networkScope(Output<String> networkScope) {
            $.networkScope = networkScope;
            return this;
        }

        /**
         * @param networkScope Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
         * 
         * @return builder
         * 
         */
        public Builder networkScope(String networkScope) {
            return networkScope(Output.of(networkScope));
        }

        /**
         * @param token Provide a valid token created on the remote environment.
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Provide a valid token created on the remote environment.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param uri Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public RemoteEnvironmentsArgs build() {
            $.networkScope = Objects.requireNonNull($.networkScope, "expected parameter 'networkScope' to be non-null");
            $.token = Objects.requireNonNull($.token, "expected parameter 'token' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
