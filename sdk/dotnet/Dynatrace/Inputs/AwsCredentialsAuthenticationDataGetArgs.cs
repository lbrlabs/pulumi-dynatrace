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

    public sealed class AwsCredentialsAuthenticationDataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the access key
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// the ID of the Amazon account
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// the external ID token for setting an IAM role. You can obtain it with the `GET /aws/iamExternalId` request
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// the IAM role to be used by Dynatrace to get monitoring data
        /// </summary>
        [Input("iamRole")]
        public Input<string>? IamRole { get; set; }

        /// <summary>
        /// the secret access key
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        /// <summary>
        /// Any attributes that aren't yet supported by this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public AwsCredentialsAuthenticationDataGetArgs()
        {
        }
        public static new AwsCredentialsAuthenticationDataGetArgs Empty => new AwsCredentialsAuthenticationDataGetArgs();
    }
}
