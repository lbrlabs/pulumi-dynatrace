// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DiskOptionsExclusionsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskOptionsArgs Empty = new DiskOptionsArgs();

    /**
     * OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
     * disks from the monitoring list.
     * 
     */
    @Import(name="exclusions")
    private @Nullable Output<DiskOptionsExclusionsArgs> exclusions;

    /**
     * @return OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
     * disks from the monitoring list.
     * 
     */
    public Optional<Output<DiskOptionsExclusionsArgs>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
     * Requires OneAgent 1.209 or later
     * 
     */
    @Import(name="nfsShowAll", required=true)
    private Output<Boolean> nfsShowAll;

    /**
     * @return When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
     * Requires OneAgent 1.209 or later
     * 
     */
    public Output<Boolean> nfsShowAll() {
        return this.nfsShowAll;
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

    private DiskOptionsArgs() {}

    private DiskOptionsArgs(DiskOptionsArgs $) {
        this.exclusions = $.exclusions;
        this.nfsShowAll = $.nfsShowAll;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskOptionsArgs $;

        public Builder() {
            $ = new DiskOptionsArgs();
        }

        public Builder(DiskOptionsArgs defaults) {
            $ = new DiskOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusions OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
         * disks from the monitoring list.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(@Nullable Output<DiskOptionsExclusionsArgs> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        /**
         * @param exclusions OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
         * disks from the monitoring list.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(DiskOptionsExclusionsArgs exclusions) {
            return exclusions(Output.of(exclusions));
        }

        /**
         * @param nfsShowAll When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
         * Requires OneAgent 1.209 or later
         * 
         * @return builder
         * 
         */
        public Builder nfsShowAll(Output<Boolean> nfsShowAll) {
            $.nfsShowAll = nfsShowAll;
            return this;
        }

        /**
         * @param nfsShowAll When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
         * Requires OneAgent 1.209 or later
         * 
         * @return builder
         * 
         */
        public Builder nfsShowAll(Boolean nfsShowAll) {
            return nfsShowAll(Output.of(nfsShowAll));
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

        public DiskOptionsArgs build() {
            $.nfsShowAll = Objects.requireNonNull($.nfsShowAll, "expected parameter 'nfsShowAll' to be non-null");
            return $;
        }
    }

}
