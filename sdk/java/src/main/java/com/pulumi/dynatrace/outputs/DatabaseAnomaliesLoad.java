// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.DatabaseAnomaliesLoadDrops;
import com.pulumi.dynatrace.outputs.DatabaseAnomaliesLoadSpikes;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseAnomaliesLoad {
    /**
     * @return The configuration of traffic drops detection
     * 
     */
    private @Nullable DatabaseAnomaliesLoadDrops drops;
    /**
     * @return The configuration of traffic spikes detection
     * 
     */
    private @Nullable DatabaseAnomaliesLoadSpikes spikes;

    private DatabaseAnomaliesLoad() {}
    /**
     * @return The configuration of traffic drops detection
     * 
     */
    public Optional<DatabaseAnomaliesLoadDrops> drops() {
        return Optional.ofNullable(this.drops);
    }
    /**
     * @return The configuration of traffic spikes detection
     * 
     */
    public Optional<DatabaseAnomaliesLoadSpikes> spikes() {
        return Optional.ofNullable(this.spikes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAnomaliesLoad defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DatabaseAnomaliesLoadDrops drops;
        private @Nullable DatabaseAnomaliesLoadSpikes spikes;
        public Builder() {}
        public Builder(DatabaseAnomaliesLoad defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drops = defaults.drops;
    	      this.spikes = defaults.spikes;
        }

        @CustomType.Setter
        public Builder drops(@Nullable DatabaseAnomaliesLoadDrops drops) {
            this.drops = drops;
            return this;
        }
        @CustomType.Setter
        public Builder spikes(@Nullable DatabaseAnomaliesLoadSpikes spikes) {
            this.spikes = spikes;
            return this;
        }
        public DatabaseAnomaliesLoad build() {
            final var o = new DatabaseAnomaliesLoad();
            o.drops = drops;
            o.spikes = spikes;
            return o;
        }
    }
}
