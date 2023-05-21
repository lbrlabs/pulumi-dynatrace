// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesBlockListRule
    {
        public readonly string? AttributeExpression;
        public readonly string? CssExpression;
        public readonly bool? HideUserInteraction;
        public readonly string Target;

        [OutputConstructor]
        private SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesBlockListRule(
            string? attributeExpression,

            string? cssExpression,

            bool? hideUserInteraction,

            string target)
        {
            AttributeExpression = attributeExpression;
            CssExpression = cssExpression;
            HideUserInteraction = hideUserInteraction;
            Target = target;
        }
    }
}