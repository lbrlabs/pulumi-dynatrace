// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.OwnershipTeamsLinksLinkArgs;
import java.util.List;
import java.util.Objects;


public final class OwnershipTeamsLinksArgs extends com.pulumi.resources.ResourceArgs {

    public static final OwnershipTeamsLinksArgs Empty = new OwnershipTeamsLinksArgs();

    @Import(name="links", required=true)
    private Output<List<OwnershipTeamsLinksLinkArgs>> links;

    public Output<List<OwnershipTeamsLinksLinkArgs>> links() {
        return this.links;
    }

    private OwnershipTeamsLinksArgs() {}

    private OwnershipTeamsLinksArgs(OwnershipTeamsLinksArgs $) {
        this.links = $.links;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OwnershipTeamsLinksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OwnershipTeamsLinksArgs $;

        public Builder() {
            $ = new OwnershipTeamsLinksArgs();
        }

        public Builder(OwnershipTeamsLinksArgs defaults) {
            $ = new OwnershipTeamsLinksArgs(Objects.requireNonNull(defaults));
        }

        public Builder links(Output<List<OwnershipTeamsLinksLinkArgs>> links) {
            $.links = links;
            return this;
        }

        public Builder links(List<OwnershipTeamsLinksLinkArgs> links) {
            return links(Output.of(links));
        }

        public Builder links(OwnershipTeamsLinksLinkArgs... links) {
            return links(List.of(links));
        }

        public OwnershipTeamsLinksArgs build() {
            $.links = Objects.requireNonNull($.links, "expected parameter 'links' to be non-null");
            return $;
        }
    }

}
