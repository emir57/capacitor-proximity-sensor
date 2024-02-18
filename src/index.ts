import { registerPlugin } from '@capacitor/core';

import type { proximitySensorPlugin } from './definitions';

const proximitySensor = registerPlugin<proximitySensorPlugin>('proximitySensor', {
  web: () => import('./web').then(m => new m.proximitySensorWeb()),
});

export * from './definitions';
export { proximitySensor };
