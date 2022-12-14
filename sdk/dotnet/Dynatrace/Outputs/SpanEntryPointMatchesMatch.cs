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
    public sealed class SpanEntryPointMatchesMatch
    {
        public readonly bool? CaseSensitive;
        public readonly string Comparison;
        public readonly string? Key;
        public readonly string Source;
        public readonly string? Value;

        [OutputConstructor]
        private SpanEntryPointMatchesMatch(
            bool? caseSensitive,

            string comparison,

            string? key,

            string source,

            string? value)
        {
            CaseSensitive = caseSensitive;
            Comparison = comparison;
            Key = key;
            Source = source;
            Value = value;
        }
    }
}
