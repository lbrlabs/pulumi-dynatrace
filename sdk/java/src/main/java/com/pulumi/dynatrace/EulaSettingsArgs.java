// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EulaSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EulaSettingsArgs Empty = new EulaSettingsArgs();

    /**
     * Display end user terms to new users logging in to the environment
     * 
     */
    @Import(name="enableEula", required=true)
    private Output<Boolean> enableEula;

    /**
     * @return Display end user terms to new users logging in to the environment
     * 
     */
    public Output<Boolean> enableEula() {
        return this.enableEula;
    }

    /**
     * The scope of this setting (environment)
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (environment)
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private EulaSettingsArgs() {}

    private EulaSettingsArgs(EulaSettingsArgs $) {
        this.enableEula = $.enableEula;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EulaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EulaSettingsArgs $;

        public Builder() {
            $ = new EulaSettingsArgs();
        }

        public Builder(EulaSettingsArgs defaults) {
            $ = new EulaSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableEula Display end user terms to new users logging in to the environment
         * 
         * @return builder
         * 
         */
        public Builder enableEula(Output<Boolean> enableEula) {
            $.enableEula = enableEula;
            return this;
        }

        /**
         * @param enableEula Display end user terms to new users logging in to the environment
         * 
         * @return builder
         * 
         */
        public Builder enableEula(Boolean enableEula) {
            return enableEula(Output.of(enableEula));
        }

        /**
         * @param scope The scope of this setting (environment)
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (environment)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public EulaSettingsArgs build() {
            $.enableEula = Objects.requireNonNull($.enableEula, "expected parameter 'enableEula' to be non-null");
            return $;
        }
    }

}
