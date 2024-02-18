export interface proximitySensorPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
