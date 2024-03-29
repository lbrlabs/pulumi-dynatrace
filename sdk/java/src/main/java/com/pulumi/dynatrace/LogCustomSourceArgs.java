// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.LogCustomSourceContextArgs;
import com.pulumi.dynatrace.inputs.LogCustomSourceCustomLogSourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogCustomSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogCustomSourceArgs Empty = new LogCustomSourceArgs();

    /**
     * Define Custom Log Source only within context if provided
     * 
     */
    @Import(name="context")
    private @Nullable Output<LogCustomSourceContextArgs> context;

    /**
     * @return Define Custom Log Source only within context if provided
     * 
     */
    public Optional<Output<LogCustomSourceContextArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="customLogSource", required=true)
    private Output<LogCustomSourceCustomLogSourceArgs> customLogSource;

    /**
     * @return no documentation available
     * 
     */
    public Output<LogCustomSourceCustomLogSourceArgs> customLogSource() {
        return this.customLogSource;
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private LogCustomSourceArgs() {}

    private LogCustomSourceArgs(LogCustomSourceArgs $) {
        this.context = $.context;
        this.customLogSource = $.customLogSource;
        this.enabled = $.enabled;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogCustomSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogCustomSourceArgs $;

        public Builder() {
            $ = new LogCustomSourceArgs();
        }

        public Builder(LogCustomSourceArgs defaults) {
            $ = new LogCustomSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Define Custom Log Source only within context if provided
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<LogCustomSourceContextArgs> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Define Custom Log Source only within context if provided
         * 
         * @return builder
         * 
         */
        public Builder context(LogCustomSourceContextArgs context) {
            return context(Output.of(context));
        }

        /**
         * @param customLogSource no documentation available
         * 
         * @return builder
         * 
         */
        public Builder customLogSource(Output<LogCustomSourceCustomLogSourceArgs> customLogSource) {
            $.customLogSource = customLogSource;
            return this;
        }

        /**
         * @param customLogSource no documentation available
         * 
         * @return builder
         * 
         */
        public Builder customLogSource(LogCustomSourceCustomLogSourceArgs customLogSource) {
            return customLogSource(Output.of(customLogSource));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
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
         * @param scope The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public LogCustomSourceArgs build() {
            $.customLogSource = Objects.requireNonNull($.customLogSource, "expected parameter 'customLogSource' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
