//  Created by react-native-create-bridge

import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'

const react-native-parsely = requireNativeComponent('react-native-parsely', react-native-parselyView)

export default class react-native-parselyView extends Component {
  render () {
    return <react-native-parsely {...this.props} />
  }
}

react-native-parselyView.propTypes = {
  exampleProp: React.PropTypes.any
}
