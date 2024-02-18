import { WebPlugin } from '@capacitor/core';

import type { proximityInfos, proximitySensorPlugin } from './definitions';

export class proximitySensorWeb
  extends WebPlugin
  implements proximitySensorPlugin
{
  isActive(): Promise<proximityInfos> {
    throw new Error('Method not implemented.');
  }
  async activeProximitySensor(): Promise<proximityInfos> {
    throw new Error('Method not implemented.');
  }
  async deActiveProximitySensor(): Promise<proximityInfos> {
    throw new Error('Method not implemented.');
  }
}
