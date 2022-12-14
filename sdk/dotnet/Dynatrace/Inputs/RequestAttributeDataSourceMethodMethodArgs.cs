// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class RequestAttributeDataSourceMethodMethodArgs : global::Pulumi.ResourceArgs
    {
        [Input("argumentTypes")]
        private InputList<string>? _argumentTypes;
        public InputList<string> ArgumentTypes
        {
            get => _argumentTypes ?? (_argumentTypes = new InputList<string>());
            set => _argumentTypes = value;
        }

        [Input("className")]
        public Input<string>? ClassName { get; set; }

        [Input("fileName")]
        public Input<string>? FileName { get; set; }

        [Input("fileNameMatcher")]
        public Input<string>? FileNameMatcher { get; set; }

        [Input("methodName", required: true)]
        public Input<string> MethodName { get; set; } = null!;

        [Input("modifiers")]
        private InputList<string>? _modifiers;
        public InputList<string> Modifiers
        {
            get => _modifiers ?? (_modifiers = new InputList<string>());
            set => _modifiers = value;
        }

        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        [Input("visibility", required: true)]
        public Input<string> Visibility { get; set; } = null!;

        public RequestAttributeDataSourceMethodMethodArgs()
        {
        }
        public static new RequestAttributeDataSourceMethodMethodArgs Empty => new RequestAttributeDataSourceMethodMethodArgs();
    }
}
