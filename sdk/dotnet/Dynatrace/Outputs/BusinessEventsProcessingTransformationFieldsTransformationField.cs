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
    public sealed class BusinessEventsProcessingTransformationFieldsTransformationField
    {
        public readonly bool Array;
        public readonly string Name;
        public readonly bool Optional;
        public readonly bool Readonly;
        public readonly string Type;

        [OutputConstructor]
        private BusinessEventsProcessingTransformationFieldsTransformationField(
            bool array,

            string name,

            bool optional,

            bool @readonly,

            string type)
        {
            Array = array;
            Name = name;
            Optional = optional;
            Readonly = @readonly;
            Type = type;
        }
    }
}
