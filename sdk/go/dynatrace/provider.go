// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the dynatrace package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	DtApiToken        pulumi.StringPtrOutput `pulumi:"dtApiToken"`
	DtClusterApiToken pulumi.StringPtrOutput `pulumi:"dtClusterApiToken"`
	DtClusterUrl      pulumi.StringPtrOutput `pulumi:"dtClusterUrl"`
	DtEnvUrl          pulumi.StringPtrOutput `pulumi:"dtEnvUrl"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if isZero(args.DtApiToken) {
		args.DtApiToken = pulumi.StringPtr(getEnvOrDefault("", nil, "DYNATRACE_API_TOKEN", "DT_API_TOKEN").(string))
	}
	if isZero(args.DtClusterApiToken) {
		args.DtClusterApiToken = pulumi.StringPtr(getEnvOrDefault("", nil, "DYNATRACE_CLUSTER_API_TOKEN", "DT_CLUSTER_API_TOKEN").(string))
	}
	if isZero(args.DtClusterUrl) {
		args.DtClusterUrl = pulumi.StringPtr(getEnvOrDefault("", nil, "DYNATRACE_CLUSTER_URL", "DT_CLUSTER_URL").(string))
	}
	if isZero(args.DtEnvUrl) {
		args.DtEnvUrl = pulumi.StringPtr(getEnvOrDefault("", nil, "DYNATRACE_ENV_URL", "DT_ENV_URL").(string))
	}
	if args.DtApiToken != nil {
		args.DtApiToken = pulumi.ToSecret(args.DtApiToken).(pulumi.StringPtrOutput)
	}
	if args.DtClusterApiToken != nil {
		args.DtClusterApiToken = pulumi.ToSecret(args.DtClusterApiToken).(pulumi.StringPtrOutput)
	}
	if args.DtClusterUrl != nil {
		args.DtClusterUrl = pulumi.ToSecret(args.DtClusterUrl).(pulumi.StringPtrOutput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"dtApiToken",
		"dtClusterApiToken",
		"dtClusterUrl",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:dynatrace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	DtApiToken        *string `pulumi:"dtApiToken"`
	DtClusterApiToken *string `pulumi:"dtClusterApiToken"`
	DtClusterUrl      *string `pulumi:"dtClusterUrl"`
	DtEnvUrl          *string `pulumi:"dtEnvUrl"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	DtApiToken        pulumi.StringPtrInput
	DtClusterApiToken pulumi.StringPtrInput
	DtClusterUrl      pulumi.StringPtrInput
	DtEnvUrl          pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) DtApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.DtApiToken }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) DtClusterApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.DtClusterApiToken }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) DtClusterUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.DtClusterUrl }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) DtEnvUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.DtEnvUrl }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
