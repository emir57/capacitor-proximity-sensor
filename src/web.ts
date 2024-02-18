import { WebPlugin } from '@capacitor/core';

import type { proximitySensorPlugin } from './definitions';

export class proximitySensorWeb extends WebPlugin implements proximitySensorPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
