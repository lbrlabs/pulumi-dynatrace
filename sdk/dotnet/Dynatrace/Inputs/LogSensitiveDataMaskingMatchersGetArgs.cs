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

    public sealed class LogSensitiveDataMaskingMatchersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchers", required: true)]
        private InputList<Inputs.LogSensitiveDataMaskingMatchersMatcherGetArgs>? _matchers;
        public InputList<Inputs.LogSensitiveDataMaskingMatchersMatcherGetArgs> Matchers
        {
            get => _matchers ?? (_matchers = new InputList<Inputs.LogSensitiveDataMaskingMatchersMatcherGetArgs>());
            set => _matchers = value;
        }

        public LogSensitiveDataMaskingMatchersGetArgs()
        {
        }
        public static new LogSensitiveDataMaskingMatchersGetArgs Empty => new LogSensitiveDataMaskingMatchersGetArgs();
    }
}