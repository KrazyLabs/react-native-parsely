//  Created by react-native-create-bridge

import { NativeModules } from 'react-native'

const { react-native-parsely } = NativeModules

export default {
  exampleMethod () {
    return react-native-parsely.exampleMethod()
  },

  EXAMPLE_CONSTANT: react-native-parsely.EXAMPLE_CONSTANT
}
