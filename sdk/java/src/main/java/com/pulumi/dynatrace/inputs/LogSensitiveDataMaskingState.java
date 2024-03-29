// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.LogSensitiveDataMaskingMaskingArgs;
import com.pulumi.dynatrace.inputs.LogSensitiveDataMaskingMatchersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogSensitiveDataMaskingState extends com.pulumi.resources.ResourceArgs {

    public static final LogSensitiveDataMaskingState Empty = new LogSensitiveDataMaskingState();

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="masking")
    private @Nullable Output<LogSensitiveDataMaskingMaskingArgs> masking;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<LogSensitiveDataMaskingMaskingArgs>> masking() {
        return Optional.ofNullable(this.masking);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="matchers")
    private @Nullable Output<LogSensitiveDataMaskingMatchersArgs> matchers;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<LogSensitiveDataMaskingMatchersArgs>> matchers() {
        return Optional.ofNullable(this.matchers);
    }

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
     * The scope of this setting (HOST-########, HOST_GROUP-########). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (HOST-########, HOST_GROUP-########). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private LogSensitiveDataMaskingState() {}

    private LogSensitiveDataMaskingState(LogSensitiveDataMaskingState $) {
        this.enabled = $.enabled;
        this.masking = $.masking;
        this.matchers = $.matchers;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSensitiveDataMaskingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSensitiveDataMaskingState $;

        public Builder() {
            $ = new LogSensitiveDataMaskingState();
        }

        public Builder(LogSensitiveDataMaskingState defaults) {
            $ = new LogSensitiveDataMaskingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param masking no documentation available
         * 
         * @return builder
         * 
         */
        public Builder masking(@Nullable Output<LogSensitiveDataMaskingMaskingArgs> masking) {
            $.masking = masking;
            return this;
        }

        /**
         * @param masking no documentation available
         * 
         * @return builder
         * 
         */
        public Builder masking(LogSensitiveDataMaskingMaskingArgs masking) {
            return masking(Output.of(masking));
        }

        /**
         * @param matchers no documentation available
         * 
         * @return builder
         * 
         */
        public Builder matchers(@Nullable Output<LogSensitiveDataMaskingMatchersArgs> matchers) {
            $.matchers = matchers;
            return this;
        }

        /**
         * @param matchers no documentation available
         * 
         * @return builder
         * 
         */
        public Builder matchers(LogSensitiveDataMaskingMatchersArgs matchers) {
            return matchers(Output.of(matchers));
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
         * @param scope The scope of this setting (HOST-########, HOST_GROUP-########). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HOST-########, HOST_GROUP-########). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public LogSensitiveDataMaskingState build() {
            return $;
        }
    }

}
