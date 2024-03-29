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
    public sealed class ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation
    {
        public readonly bool? IncludeHexNumbers;
        public readonly int? MinDigitCount;
        public readonly string? Prefix;
        public readonly string? ReplacementValue;
        public readonly string? Suffix;
        public readonly string TransformationType;

        [OutputConstructor]
        private ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation(
            bool? includeHexNumbers,

            int? minDigitCount,

            string? prefix,

            string? replacementValue,

            string? suffix,

            string transformationType)
        {
            IncludeHexNumbers = includeHexNumbers;
            MinDigitCount = minDigitCount;
            Prefix = prefix;
            ReplacementValue = replacementValue;
            Suffix = suffix;
            TransformationType = transformationType;
        }
    }
}
